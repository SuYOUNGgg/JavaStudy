import requests
from bs4 import BeautifulSoup
import os
import cx_Oracle

DB_ID = "scott"
DB_PWD = "1234"
DB_URL = "localhost/company"

def get_conn():
    os.putenv("NLS_LANG", ".UTF8")
    conn = cx_Oracle.connect(DB_ID,DB_PWD,DB_URL)
    return conn

def insert_row(conn, title, link):
    cursor = conn.cursor()
    str_sql = "INSERT INTO MOVIES_RANKS(TITLE, LINK) VALUES(:title, :link)"
    cursor.execute(str_sql, \
        {'title' : title, 'link':link})
    conn.commit()
    cursor.close()

res = requests.get("http://ticket2.movie.daum.net/Movie/MovieRankList.aspx")
soup = BeautifulSoup(res.content, 'lxml')
rankings = soup.find_all('strong',class_="tit_join")
# no =[]
# title = []
# link = []

for movie in rankings:
    m = movie.find('a')
    title, link = m.get_text().strip(), m['href']
    conn = get_conn()
    insert_row(conn,  title, link)
    # no.append(movie.find(class_="tit_join").get_text())
    # title.append(print(m.get_text().strip()))
    # link.append(print(m.get_text().strip(), m['href']))
   

print("Successed!")
