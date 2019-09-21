/*
    Assignment 22: Write a program to pass a parameter in Applet.
*/
import java.awt.*;
import java.applet.*;
public class Conditional extends Applet {
    String str;
    public void init() {
        str = getParameter("String");
        if (str == null)
        str = "Java";
    }
    public void paint(Graphics g) {
        g.drawString(str, 50, 20);
    }
    public static void main(String[] args) {
        System.out.println("Success! Now type appletviewer Conditional.html");
    }
}