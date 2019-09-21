import java.util.Scanner;
class swap
{
    public static void main(String args[])
    {
        int num1, num2;
        Scanner s = new Scanner (System.in);
        System.out.println("Before swapping: ");
        System.out.println("The first and second number is = ");
        num1 = s.nextInt();
        System.out.println("The Second number is = ");
        num2 = s.nextInt();
        swap(num1,num2);
    }
    
    private static void swap (int num1, int num2)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping, the number is: ");
        System.out.println("The first number is =  "+num1);
        System.out.println("The second number is = "+num2);
    }
}