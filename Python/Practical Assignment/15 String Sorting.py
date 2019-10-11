"""
some_string = str(input("Enter a string: "))
print(''.join(sorted(some_string, key=str.lower)))
print(''.join(sorted(some_string, key=str.lower, reverse = True)))

in_string = list(map(str, input("Enter a sentence: ").split()))
sorted_string = sorted(in_string, key=str.lower)
reverse_sorted = sorted(in_string, key=str.lower, reverse = True)
print(' '.join(in_string))
print(' '.join(sorted_string))
print(' '.join(reverse_sorted))
"""

# Take a string from user, print in in reverse then sort
# it in ascending and descending order.

in_string = input('Enter a string: ')
rev = ''

for i in in_string:
    rev = i + rev

print("Reverse:\n", rev)
print('Ascending sorted:')
print(''.join(sorted(in_string)))
print('Decending sorted:')
print(''.join(sorted(in_string, reverse = True)))

########
input()
