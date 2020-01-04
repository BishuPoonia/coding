# write
file = open('example.txt', 'w')
file.write('This is a line.\n')
file.close()

# append
file = open('example.txt', 'a')
file.write('This is another line.\n')
file.close()

# read
file = open('example.txt', 'r')
print(file.read())
file.close()

''''
file = open('05 Type.py', 'r')
print(file.read())
file.close()
'''
