a = 0
b = 0
c = 1
num = []
for i in range(10):
    a,b = b,c
    c = a + b
    print(a)
    num.append(a)
print(num)