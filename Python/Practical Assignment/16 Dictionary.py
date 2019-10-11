# Creating a dictionary
weeks = {1: 'Sunday', 2: 'Monday', 3:'Tuesday',
         4: 'Wednesday', 5:'Thursday',
          6:'Friday', 7:'Saturday'}

pen = {'Blue': 5, 'Black': 10, 'Red': 2}

print('Values in Pen:')
for i in pen.values():
    print(i, end=' ')
print()

print('Items in Pen:')
for i in pen.items():
    print(i, end=' ')
print()

# Concatenating two dictionary values
holidays = weeks[7] + str(' and ') + weeks[1]
print("Holidays:", holidays)

# Addition of dictionary values
total_pens = pen['Blue'] + pen['Black'] + pen['Red']
print('Number of all pen:', total_pens)

# counting length of dictionary
print('Types of pen:', len(pen))

# Converting dictionary into a string
x = str(pen)
print('Now "' + x + '" is a string.')

# Adding an item in dictionary
pen['Green'] = 2
print(pen)

# Modifying an item (change a value) in dictionary
pen['Green'] = 5
print(pen)

# Deleting an item from dictionary
del weeks[6]
print(weeks)

#############
input()
