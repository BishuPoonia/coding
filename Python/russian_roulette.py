import random as r

Dead = False
print("Russian Roulette begins:\n")

while not Dead:

    # Bob spins the cylinder of Revolver
    gun = r.choice([0, 0, 0, 1, 0, 0])

    # Bob points the gun at his head and pulls the trigger
    Bob = gun
    if Bob == 0:
        print("Click!! Bob got lucky this time!")
    else:
        Dead = True
        print("BANG!! Bob got Shot and Died!")
        break;

    # Dimitri spins the cylinder of Revolver    
    gun = r.choice([0, 0, 0, 1, 0, 0])

    # Dimitri points the gun at his head and pulls the trigger
    Dimitri = gun
    if Dimitri == 0:
        print("Click!! Dimitri got lucky this time!")
    else:
        Dead = True
        print("BANG!! Dimitri got Shot and Died!")

######
input("\npress any key to exit..")
