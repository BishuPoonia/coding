number = int(input("Multiplication of number: "))
for i in range(1,11):
    table = lambda x: x * i
    print(number, "x", i, "=", table(number))

##########
input()