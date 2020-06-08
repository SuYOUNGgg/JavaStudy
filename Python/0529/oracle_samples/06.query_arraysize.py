import cx_Oracle
import os
import time

os.putenv("NLS_LANG", ".UTF8")
connection = cx_Oracle.connect("scott", '1234', 'localhost/company')

start = time.time()
cursor = connection.cursor()
cursor.execute("SELECT * FROM MEMBER")
res = cursor.fetchall()
print(res)
elapsed = (time.time() - start)
print(elapsed, "secondes")

cursor.close()
connection.close()