''''
n = 5
arr = [1, 1, 0, -1, -1]
plus, minus, zero = 0, 0, 0

for i in range(n):
    if arr[i] > 0:
        plus += 1
    elif arr[i] < 0:
        minus += 1
    else:
        zero += 1
        
plus, minus, zero = plus/n, minus/n, zero/n

print(format(plus, '.6f'))
print(format(minus, '.6f'))
print(format(zero, '.6f'))
        
'

plus, minus, zero = 0, 0, 0
n = int(input("Value of n: "))
arr = list(map
           (int,
            (input("Enter elements seperated by space: ").split()
             )))
for i in range(n):
    if arr[i] > 0:
        plus += 1
    elif arr[i] < 0:
        minus += 1
    else:
        zero += 1
    
plus, minus, zero = plus/n, minus/n, zero/n

print(format(plus, '.6f'))
print(format(minus, '.6f'))
print(format(zero, '.6f'))

'''

def plusMinus(arr):
    plus = sum(x > 0 for x in arr) / n  #len(arr) 
    minus = sum(x < 0 for x in arr) / n #len(arr)
    zero = sum(x == 0 for x in arr) / n #len(arr)

    print(format(plus, '.6f'),
          format(minus, '.6f'),
          format(zero, '.6f'),
          sep='\n')

n = int(input("n: "))
arr = list(map(int, input().split()))
plusMinus(arr)
