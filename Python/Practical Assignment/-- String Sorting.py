''''some_string = str(input("Enter a string: "))
print(''.join(sorted(some_string, key=str.lower)))
print(''.join(sorted(some_string, key=str.lower, reverse = True)))

in_string = list(map(str, input("Enter a sentence: ").split()))
sorted_string = sorted(in_string, key=str.lower)
reverse_sorted = sorted(in_string, key=str.lower, reverse = True)
print(' '.join(in_string))
print(' '.join(sorted_string))
print(' '.join(reverse_sorted))
'''

in_string = input('Enter a string: ')

temp = ''

for i in in_string:
    temp = i + temp

print("Reverse:", temp)

print(sorted(in_string, reverse = True))
