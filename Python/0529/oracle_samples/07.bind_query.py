import cx_Oracle
import os
os.putenv("NLS_LANG", ".UTF8")
connection = cx_Oracle.connect("scott", '1234', 'localhost/company')
cursor = connection.cursor()
cursor.prepare("SELECT * FROM MEMBER WHERE MEMBER_ID = :MEMBER_ID")
cursor.execute(None, {'MEMBER_ID' : 100})
res = cursor.fetchall()
print(res)
cursor.execute(None, {'MEMBER_ID' : 101})
res = cursor.fetchall()
print(res)
cursor.close()
connection.close()