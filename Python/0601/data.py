import numpy as np

names = np.array(['Bob','Joe','Will','Bob','Will','Joe','Joe'])
data = np.random.randn(7,4)
data[data<0]=0
print(data)

data[names != 'Joe'] =7
print(data)

arr = np.arange(15).reshape((3,5))
print(arr)

print(arr.T)

arr = np.random.randn(6,3)
print(arr)

print(np.dot(arr.T, arr))

arr = np.arange(16).reshape((2,2,4))