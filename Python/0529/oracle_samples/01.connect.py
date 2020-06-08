import cx_Oracle
import os
os.putenv("NLS_LANG", ".UTF8")
connection = cx_Oracle.connect("scott", '1234', 'localhost/company')
print(connection.version)
connection.close()

