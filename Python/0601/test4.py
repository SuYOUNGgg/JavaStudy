import numpy as np
x = np.arange(15).reshape((3,5))
print(x,x.shape)
x2 = x.T
print(x2, x2.shape)
x3 = np.transpose(x)
print(x3, x3.shape)
x4 = np.swapaxes(x, 0,1)
print(x4, x4.shape)

x5 = [[1,2],[3,4],[5,6]]
x6 = np.array(x5)
print(x6.shape, x6.ndim)
x7 = x6.T
print(x7.shape,x7.ndim)
print(x7)
print(np.transpose(x6))
print(np.swapaxes(x6,0,1))

x8 = np.array([[1,2,3]])
x9 = np.swapaxes(x8,0,1)
print(x9)