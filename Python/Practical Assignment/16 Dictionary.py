weeks = {1: 'Sunday', 2: 'Monday', 3:'Tuesday',
         4: 'Wednesday', 5:'Thursday', 6:'Friday', 7:'Saturday'}

holidays = weeks[1] + str(' ') + weeks[7]
print("Holidays:", holidays)

pen = {'Blue': 5, 'Black': 10, 'Red': 2}
total_pens = pen['Blue'] + pen['Black'] + pen['Red']
print('Number of all pen:', total_pens)

print('Types of pen:', len(pen))
x = str(pen)
print('Now "' + x + '" is a string.')

print('Values in Pen:')
for i in pen.values():
    print(i)

print('Items in Pen:')
for i in pen.items():
    print(i)

del weeks[5]
print(weeks)
