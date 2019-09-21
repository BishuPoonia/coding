from graphics import *

def main():
    win = GraphWin("My Window", 500, 500)
    win.setBackground(color_rgb(0,0,0))

    img = Image(Point(250,250), "logo.png")
    img.draw(win)

    win.getMouse()
    win.close()

main()
