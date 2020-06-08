# import numpy as np
# a = np.array([[0,1,2],[3,4,5],[6,7,8],[9,10,11]])
# print(a.ndim, a.shape)
# print(a[0,0],a[3,2])
# print(a[:,:])
# print(a[1,:2])
# print(a[[0,2]])

# print(a[a>10])
# print(a[a>=5])

# a2 = np.arange(24)
# print(a2)
# print(a2.ndim)
# b2 = a2.reshape(2,4,3)
# print(b2)

import numpy as np
x = [1,2,3]
a = np.asarray(x)
print(a.shape, a.ndim)

x1 = np.arange(5)
print(x1)
x2 = list(range(5))
print(x2)

x3 = np.arange(10,20,2)
print(x3)

a2 = np.array([1,2,3,4])
b2 = np.array([10,20,30,40])
c2 = a2 * b2
print(c2)

a3 = np.array([[0,0,0],[10,10,10],[20,20,20],[30,30,30]])
a4 = np.array([0,1,2])
a5 = a3 + a4
print(a5)