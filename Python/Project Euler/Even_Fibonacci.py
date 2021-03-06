''''
Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
find the sum of the even-valued terms.
'''
# Fibonacci Series
num = 100
p = 0
n = 1
temp = 2
sum = 0

for i in range(1, num):
    p, n = n, temp
    temp = n + p
    if (p%2 == 0):
        sum += p
        if sum > 4000000:
            break
print(sum)

# output: 4613732
