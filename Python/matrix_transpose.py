a = [[1,2,3], [4,5,6], [7,8,9]]
transpose = [[0,0,0], [0,0,0], [0,0,0]]

print("Before transpose:")
for i in a:
    print(i)
    
for i in range(len(a)):
    for j in range(len(a[0])):
        transpose[j][i] = a[i][j]
        
print("After transpose:")
for i in transpose:
    print (i)
