''''
Output:
        A     A
        AB   BA
        ABC CBA
        ABCDCBA
'''

def input_value():
        num = int(input("Enter a value to print pattern: "))
        if num < 3:
                print("Value too short for a pattern!")
                input_value()
        elif num >= 27:
                print("Value too big for a pattern!")
                input_value()
        else:
                return int(num)

def pattern(n):
        x = 65 + n
        for i in range(65, x):
                for a in range(65, i+1):
                    ch = chr(a)
                    print(ch, end='')
                for b in range(x-2 - i):
                    print(" ", end='')
                for c in range(x-1 - i):
                    print(" ", end='')
                for d in reversed(range(65, i+1)):
                    if d == x-1:
                        d -= 2
                        continue
                    else:
                        ch = chr(d)
                        print(ch, end='')          
                print("\r")

n = input_value()
pattern(n)
