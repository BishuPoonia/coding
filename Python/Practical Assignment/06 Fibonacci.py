n = 10
a, b, c = 0, 1, 1

for i in range(1, n+1):
    print(a, end=', ')
    a, b = b, c
    c = a + b

###########
input()