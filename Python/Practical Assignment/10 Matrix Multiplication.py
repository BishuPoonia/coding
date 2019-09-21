a = [[1, 2, 3], 
     [4, 5, 6], 
     [7, 8, 9]]

b = [[9, 8, 7],
     [6, 5, 4], 
     [3, 2, 1]]

result = [[0, 0, 0],
         [0, 0, 0],
         [0, 0, 0]]

for i in range(len(a)):
    for j in range(len(b[0])):
        for k in range(len(b)):
            result[i][j] += a[i][k] * b[k][j]

for i in result:
    print(i)


###########
input()