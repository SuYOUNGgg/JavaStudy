import cx_Oracle
import os
import time

os.putenv("NLS_LANG", ".UTF8")
connection = cx_Oracle.connect("scott", '1234', 'localhost/company')

rows = [(115,'정수미','03/12/10','대리',24000,40,104,20),
    (116,'김지희','20/05/07','사원',6000,105,40,20)]

cursor = connection.cursor()
cursor.bindarraysize = 2
cursor.setinputsizes(int, 25, 8, 10, 10, 5, 6, 4)
cursor.executemany("INSERT INTO MEMBER VALUES(:1, :2, to_date(:3,'yyyy-mm-dd'), :4, :5, :6, :7, :8)", rows)
connection.commit()

cursor2 = connection.cursor()
cursor2.execute("SELECT * FROM MEMBER")
res = cursor2.fetchall()
print(res)
cursor.close()
cursor2.close()
connection.close()
