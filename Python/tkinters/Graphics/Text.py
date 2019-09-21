from graphics import *

def main():
        win = GraphWin("My Window", 500, 500)
        win.setBackground(color_rgb(0, 0, 0))

        txt = Text(Point(250, 250), "Hello World!")
        txt.setTextColor(color_rgb(0, 255, 200))
        txt.setSize(30)
        txt.setFace('courier')
        txt.draw(win)

        win.getMouse()
        win.close()
        
main()
