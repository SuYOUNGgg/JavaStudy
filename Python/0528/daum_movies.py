import requests
from bs4 import BeautifulSoup

res = requests.get("http://ticket2.movie.daum.net/Movie/MovieRankList.aspx")
soup = BeautifulSoup(res.content, 'lxml')
print(soup)
rankings = soup.find_all('strong',class_="tit_join")
#print(rankings)
for movie in rankings:
    m = movie.find('a')
    print(m.get_text().strip()) #글자만 나오게하는 것
    print(m.get_text().strip(), m['href'])