a = 20
b = 10

#Method 1
print("Before swapping: a = ", a, " b = ", b)
a, b = b, a
print("After swapping: a = ", a, " b = ", b)

#Method 2
print("Before swapping: a = ", a, " b = ", b)
c = a
a = b 
b = c 
print("After swapping: a = ", a, " b = ", b)