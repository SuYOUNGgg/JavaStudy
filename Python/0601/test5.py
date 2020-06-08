import numpy as np
a = np.arange(3)
print(a.shape,a.ndim)
print(a)

a1 = a.reshape(1,3)
print(a1.shape,a1.ndim)

a2 = np.swapaxes(a1,0,1) #행과 열이 바뀐것
print(a2)
print(a2.shape, a2.ndim)

a3 = np.arange(6).reshape(1,2,3) #3차원이고, 2행3열인 모양으로 바꾸는 것
print(a3)
print(a3.shape, a3.ndim)

a4 = np.swapaxes(a3, 1, 2)
print(a4)
print(a4.shape, a4.ndim)

a5 = np.swapaxes(a3,0,1)
print(a5.shape, a5.ndim)
print(a5)

a6 = np.arange(6).reshape(2,3)
print(a6)
a7 = a6.T
print(a7)
print(a7.shape, a7.ndim)

a6 = np.arange(6).reshape(1,2,3)
print(a6)
print("------")
a7 = np.transpose(a6,(1,0,2))
a8 = a6.transpose((1,0,2))
print(a7)
print(a8)
 
a9 = np.transpose(a6, (1,0,2))
print(a9)
print(a6)

a10 = np.swapaxes(a6, 1, 2)
print(a10.shape)
print(a10)
a11 = np.swapaxes(a10, 0,1)
print(a11.shape, a11.ndim)
a12 = np.swapaxes(a11, 0,1)
print(a12.shape, a12.ndim)

a13 = np.arange(16).reshape(2,2,4)
print(a13)

a14 = np.transpose(a13,(1,0,2))
print(a14.shape)



