/*
    Assignment 15: Write a program to calculate area using interface.
*/

interface Area {
    final static float pi = 3.14f;
    float compute (float x, float y);
}
class Rectangle implements Area {
    public float compute (float x, float y) {
    return (x * y);
    }
}
class Circle implements Area {
    public float compute (float x, float y) {
        return (pi * x * x);
    }
}
class Assignment15 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        Area area;
        area = rect;
        System.out.println("Area of Rectangle = " + area.compute(10,20));
        area = cir;
        System.out.println("Area of Circle = " + area.compute(10, 0));
    }
}