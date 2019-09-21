a = [[1,2,3], [4,5,6], [7,8,9]]

b = [[9,8,7], [6,5,4], [3,2,1]]

c = [[0,0,0], [0,0,0], [0,0,0]]

#Printing Matrices
print("Matrix A:\n")
for _ in a:
    print(_)

print("\nMatrix B:\n")
for _ in b:
    print(_)

#Adding both Matrices
for i in range(0, len(a)):
    for j in range(0, len(b)):
        c[i][j] = a[i][j] + b[i][j]

#Printing the addition result
print("\nAddition of A and B:\n")
for _ in c:
    print(_)

#Substracting both Matrices
for i in range(0, len(a)):
    for j in range(0, len(b)):
        c[i][j] = a[i][j] - b[i][j]

#Printing the substraction result
print("\nSubstraction of A and B:\n")
for _ in c:
    print(_)