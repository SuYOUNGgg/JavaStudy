import cx_Oracle
import os
os.putenv("NLS_LANG", ".UTF8")
connection = cx_Oracle.connect("scott",'1234','localhost/company')
c = connection.cursor()
c.execute("select * from dept")
print(type(c))
d = []
for row in c:
    d.append(row[0])
    print(row[0],'-', row[1])
print(d)