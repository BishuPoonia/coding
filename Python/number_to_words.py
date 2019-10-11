numbers = {
    0: '',
    1: 'one',
    2: 'two',
    3: 'three',
    4: 'four',
    5: 'five',
    6: 'six',
    7: 'seven',
    8: 'eight',
    9: 'nine',
    10: 'ten',
    11: 'eleven',
    12: 'twelve',
    13: 'thirteen',
    14: 'fourteen',
    15: 'fifteen',
    16: 'sixteen',
    17: 'seventeen',
    18: 'eighteen',
    19: 'nineteen',
    20: 'twenty',
    30: 'thirty',
    40: 'fourty',
    50: 'fifty',
    60: 'sixty',
    70: 'seventy',
    80: 'eighty',
    90: 'ninty',
    100: 'one hundred',
    200: 'two hundred',
    300: 'three hundred',
    400: 'four hundred',
    500: 'five hundred',
    600: 'six hundred',
    700: 'seven hundred',
    800: 'eight hundred',
    900: 'nine hundred',
    1000: 'one thousand',
}

digit = int(input("Enter numbers in digits:"))
if digit in numbers:
    print(numbers[digit])
elif digit < 1000:
    digit1 = (digit % 10)
    digit10 = (digit % 100 - digit1)
    digit100 = (digit // 100) * 100
    print(numbers[digit100], numbers[digit10], numbers[digit1])
else:
    print('Number is too big, enter a number less than one thousand.')
