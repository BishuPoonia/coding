in_string = str(input("Enter a string: "))
rev_string = ''
for i in range(len(in_string)-1, -1, -1):
    rev_string += in_string[i]
if in_string == rev_string:
    print(in_string, "is a palindromic string.")
else:
    print(in_string, "is not a palindromic string.")

##########
input()
