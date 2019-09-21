import java.util.Scanner;
class fibonacci
{
    public static void main(String args[])
    {
        int n;
        int a = 0, b = 0, c = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        n = scan.nextInt();
        System.out.println("The fibonacci series is: ");

        for (int i = 1; i <= n; i++)
            {
                a = b;
                b = c;
                c = a + b;
                System.out.print(a+" ");
            }
    }
}