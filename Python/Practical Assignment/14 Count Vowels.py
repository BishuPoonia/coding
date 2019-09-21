in_string = str(input("Enter a string: "))
vowels = "a,e,i,o,u,A,E,I,O,U"
vowel_count = 0
char = ''

for i in range(len(in_string)):
    char = in_string[i]
    if char in vowels:
        vowel_count += 1

print('String "' + in_string + '" have', vowel_count, 'vowels.')

##########
input()