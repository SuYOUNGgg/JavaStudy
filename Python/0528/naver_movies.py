import requests
from bs4 import BeautifulSoup

res = requests.get("https://movie.naver.com/movie/sdb/rank/rmovie.nhn")
soup = BeautifulSoup(res.content, 'lxml')
rankings = soup.find_all('table',class_="list_ranking")
movies = rankings[0].find_all('div',class_="tit3")

for movie in movies:
    m = movie.find('a')
    print(m.get_text(),m['href'])