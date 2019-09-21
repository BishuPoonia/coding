def compare_list(a, b):
    
    alice_score = 0
    bob_score = 0

    for i in range(len(a)):
        if a[i] > b[i]:
            alice_score += 1
        elif a[i] < b[i]:
            bob_score += 1
    
    return [alice_score, bob_score]


alice = [48, 56, 62, 81, 47, 53]
bob = [51, 38, 63, 53, 73, 81]

result = compare_list(alice, bob)
print(result)

''''

alice = [1, 2, 3, 4, 5]
bob = [5, 4, 3, 2, 1]

a = 0
b = 0

for i in range(len(alice)):
    if (alice[i] > bob[i]):
        a += 1
    elif (alice[i] < bob[i]):
        b += 1

print(a, b)


'''
