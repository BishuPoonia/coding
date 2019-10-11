import random as r

player1 = r.choice([1, 2, 3, 4, 5, 6])
player2 = r.randrange(1, 7)

print("Player 1 rolled the dice and got", player1)
print("Player 2 rolled the dice and got", player2)

if player1 == player2:
    print("It's a Tie!")
else:
    print("Player 1 won!") if player1 > player2\
    else print("Player 2 won!")

########
input()
