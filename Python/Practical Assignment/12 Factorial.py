def factorial(n):
    return n if n == 1 else n * factorial(n-1)
    
n = int(input("Enter a number to find its factorial: "))
print(factorial(n))

#########
input()