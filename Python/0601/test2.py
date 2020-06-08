#퀴즈 정답
import time
import requests
from bs4 import BeautifulSoup
import numpy as np

URL = "http://ticket2.movie.daum.net/Movie/MovieRankList.aspx"

res = requests.get(URL)
soup = BeautifulSoup(res.content, 'lxml')
box = soup.find_all('div', class_="desc_boxthumb")

count = 0
data = []
for movie in box:  
    title, ranking = movie.find('strong', class_="tit_join"), movie.find('em', class_="emph_grade")
    movie, grade = title.get_text().strip(), ranking.get_text().strip()
    # print(movie, grade)
    list = [movie, grade]
    data.append(list)
    count += 1


d = np.array(data)
print(d.shape, d.ndim)
print(d)