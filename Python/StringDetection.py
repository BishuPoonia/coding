myString = str(input("Please enter a string: "))

all_alphabets = "abcdefghijklmnopqrstuvwxyz"
all_numbers = "0123456789"
all_vowels = "aeiou"

vowels = []
consonants = []
numbers = []
spaces = []
symbols = []

for _ in myString:
	if _ in all_alphabets or _ in all_alphabets.upper():
		if _ in all_vowels or _ in all_vowels.upper():
			vowels.append(_)
		else:
			consonants.append(_)
	elif _ in all_numbers:
		numbers.append(_)
	elif _ in ' ':
		spaces.append(_)
	else:
		symbols.append(_)

print("\nTotal characters in string:", len(myString))
print("\nVowels in string:", len(vowels), "\n", vowels)
print("\nConsonants in string:", len(consonants), "\n", consonants)
print("\nnumbers in string:", len(numbers), "\n", numbers)
print("\nSpaces in string:", len(spaces), "\n", spaces)
print("\nSymbols in string:", len(symbols), "\n", symbols)