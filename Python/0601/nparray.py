import numpy as np

data = [[0,1,2,3],[4,5,6,7],[8,9,10,11]]
arr = np.array(data)
print(arr)
even_arr = arr%2==0
answer = arr[even_arr]
print(sum(answer))