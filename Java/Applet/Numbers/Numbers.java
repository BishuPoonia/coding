/*
    Assignment 21: Write a program to display numbers using Applet.
*/

import java.awt.*;
import java.applet.*;
public class Numbers extends Applet {
	public void paint(Graphics g) {
		int a = 10;
		int b = 20;
		int sum = a + b;
		String str_sum = "Sum of 10 and 20 = " + String.valueOf(sum);
		String end = " = x = x =";
		g.drawString(str_sum,100,50);
		g.drawString(end,130,70);
	}
	public static void main(String[] args) {
	System.out.println("Success! Now type appletviewer Numbers.html");
	}
}