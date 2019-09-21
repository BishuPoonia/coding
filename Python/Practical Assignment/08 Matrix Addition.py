matrixA = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
matrixB = [[9, 8, 7], [6, 5, 4], [3, 2, 1]]
result = []
for i in range(len(matrixA)):
    result.append([matrixA[i][j] + matrixB[i][j]
                   for j in range(len(matrixA[0]))])
for r in result:
    print(r)


##########
input()