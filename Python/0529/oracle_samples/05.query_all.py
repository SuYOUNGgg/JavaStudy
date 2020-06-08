import cx_Oracle
import os
os.putenv("NLS_LANG", ".UTF8")
connection = cx_Oracle.connect("scott", '1234', 'localhost/company')
cursor = connection.cursor()
cursor.execute("SELECT * FROM MEMBER")
res = cursor.fetchall()
print(res)
cursor.close()
connection.close()