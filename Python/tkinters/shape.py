import turtle

s = turtle.Screen()
t = turtle.Turtle()

length = None
while not length:
    try:
        length = float(input('Enter your preferred turtle line length: '))
    except ValueError:
        print('You need to enter a number')

width = None
while not width:
    try:
        width = int(input('Enter your preferred turtle line width: '))
    except ValueError:
        print('You need to enter a positive integer')
    else:
        if width < 1:
            print('You need to enter a positive integer')
            width = None
color = None
while not color:
    color = input('Enter your preferred turtle line color: ')
    try:
        t.pencolor(color)
    except:
        print('You need to enter a color that I know.')
        color = None
shape = None
while not shape:
    shape = input('Specify whether you want to draw a line, triangle, or square: ')
    if shape.lower() not in ['line', 'triangle', 'square']:
        shape = None
        print('I only draw lines, triangles and squares!')


t.pensize(width)
if shape.lower() == 'line':
    t.forward(length)
elif shape.lower() == 'triangle':
    t.forward(length)
    t.right(120)
    t.forward(length)
    t.right(120)
    t.forward(length)
else:
    t.forward(length)
    t.right(90)
    t.forward(length)
    t.right(90)
    t.forward(length)
    t.right(90)
    t.forward(length)

s.exitonclick()
