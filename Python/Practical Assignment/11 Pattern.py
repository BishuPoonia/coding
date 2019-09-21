for i in range(5):
    for j in range(5):
        print("X", end='')
    print()
print("\n\n")

for i in range(5):
    for j in range(i+1):
        print("X", end='')
    print()
print("\n\n")

for i in range(5, 0, -1):
    for j in range(i):
        print("X", end='')
    print()
print("\n\n")

for i in range(5):
    for j in range(4 - i):
        print(" ", end='')
    for k in range(i+1):
        print("X", end='')
    print()

################
input()