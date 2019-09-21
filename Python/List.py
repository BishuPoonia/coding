# Creating a List

a = [1,2,3,4,5,6,7,8,9,0]
b = [0,9,8,7,6,5,4,3,2,1]

# Printing a List

print(a)        # prints entire List
print(a[4])     # prints an element on a specific Index
print(b[-1])    # prints an element from the right side

for i in (-1,-len(b)-1, -1): # Starting from Right(-1), total elements in the list (length), steps per iteration(-1)
    print(b[i])

# Dropping a List 

x = [1,1,1,1,1,1,1,1,1,1]
print(x)
drop(x)
print(x)
