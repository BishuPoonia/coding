def rc():
    a_r, a_c, b_r, b_c = 0, 0, 0, 0

    print("Enter the no. of Rows and Columns for matrix A and B:")
    a_r = int(input("no. of rows in matrix A: "))
    a_c = int(input("no. of column in matrix A: "))
    b_r = int(input("no. of rows in matrix B: "))
    b_c = int(input("no. of columns in matrix B: "))

    print("Order of Matrix A: ", a_r, "x", a_c, sep='')
    print("Order of Matrix B: ", b_r, "x", b_c, sep='')
    if a_r != b_c:
        print("Multiplication of two matrices is only possible if " + \
              "no. of rows in Matrix A equals to " + \
              "no. of columns in Matrix B.")
        rc()
    else:
        return a_r, b_r


def result_matrix(n):
    r = []
    temp = 0
    for i in range(n):
        r.append([])
        for j in range(n):
            r[i].append(temp)
    return r


def matrix_input(a_row, b_row):
    print("Elements in Matrix A:\n")
    for i in range(a_row):
        a.append(list(map(int, input().split())))

    print("Elements in Matrix B:\n")
    for j in range(b_row):
        b.append(list(map(int, input().split())))


def matrix_multiplication():
    for i in range(len(a)):
        for j in range(len(b[0])):
            for k in range(len(b)):
                result[i][j] += a[i][k] * b[k][j]


def display():
    print("Matrix A:\n")
    for i in a: print(i)
    print("Matrix B:\n")
    for i in b: print(i)
    print("Multiplication of Matrix A and B:\n")
    for i in result: print(i)


a, b = [], []
a_row, b_row = rc()
result = result_matrix(a_row)
matrix_input(a_row, b_row)
matrix_multiplication()
display()
