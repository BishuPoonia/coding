import java.util.Scanner;

class multadd
{
    public static void main(String args[])
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter value: ");
    int num = scan.nextInt();
    

    int number = num;
    int mod = number%5;
    int x = mod;
    int add = 0;
        while(num>0)
            {
                int modul = num%10;
                num /= 10;
                add += modul;
            }
            //System.out.println("Addition of given number is = "+add);
            if(x == 0||add==5)
             {
            System.out.println("Number is right");
            }
            else
            System.out.println("Number not right");
    }
}