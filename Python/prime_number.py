try:
    input_number = int(input("Enter a whole number: "))

    if input_number > 1:
        for numbers in range(2,input_number):
            if input_number % numbers == 0:
                print(input_number, "is not a prime number.")
                break
        else:
            print(input_number, "is a prime number.")
    else:
        print(input_number, "is invalid input.")
except ValueError:
    print("didn't I ask you to enter a WHOLE NUMBER?")
