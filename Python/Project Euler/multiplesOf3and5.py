#If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
#The sum of these multiples is 23.
#Find the sum of all the multiples of 3 or 5 below 1000.

n = 100
sum = 0
for i in range(1, n):
    if ((i%3 == 0) or (i%5 == 0)):
        sum += i
   #     print(i, "is multiple of either 3 or 5.")
   # else:
   #     print(i, "is not a desired multiple.")
print("Sum of all the multiples of 3 and 5 below 1000 =",sum)