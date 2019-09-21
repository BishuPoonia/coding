
def diagonal_difference(arr):
    r1, r2 = 0, 0
    for i in range(n):
        T = list(map(int, arr[i]))
        r1 += T[i]
        r2 += T[-i -1]   
    return abs(r1-r2)

n = 3
arr = [[11, 2, 4],
       [4, 5, 6],
       [10, 8, -12]]

result = diagonal_difference(arr)
print(result)

''''

a = []
result = 0

for i in range(int(input("value of n: "))):
    a = list(map(int, input().split()))
    result += a[i] - a[-1 -i]
print("diagonal difference is", abs(result))

'''
