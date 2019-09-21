import turtle

def square():

    square = turtle.Turtle()
    for i in range(4):
        square.forward(50)
        square.right(90)

def hexagon():

    polygon = turtle.Turtle()
    num_sides = 6
    side_length = 70
    angle = 360.0 / num_sides

    for i in range(num_sides):
        polygon.forward(side_length)
        polygon.right(angle)

hexagon()

turtle.done()
