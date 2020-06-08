import cx_Oracle
import os
os.putenv("NLS_LANG", ".UTF8")
connection = cx_Oracle.connect("scott", '1234', 'localhost/company')
cursor = connection.cursor()
cursor.execute("SELECT * FROM MEMBER")
for result in cursor:
    print(result)
cursor.close()
connection.close()