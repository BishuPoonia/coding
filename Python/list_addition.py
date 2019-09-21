def array_sum(ar):
    return sum(ar)

ar = list(map(int, input("Enter list items: ").rstrip().split()))

print("Addition on list items:", array_sum(ar))
