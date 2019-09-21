/**
 *  Tuesday 17th July 2018
 *  Palindrome */

import java.util.Scanner;

class palindrome
{
    public static void main(String args[])
    {
        int number;
        Scanner num = new Scanner (System.in);
        System.out.print("Enter the value: ");
        number = num.nextInt();
        palindrome(number);
    }

    private static void palindrome(int number)
    {
        int modulas = 0;
        int revnum = 0;
        int newnumber = number;

        while(number>0)
            {
                modulas = number % 10;
                revnum = revnum * 10 + modulas;
                number = number / 10;
            }
               if(newnumber==revnum)
                 System.out.println("Given value is Palindromic.");
               else
                System.out.println("Given value is not Palindromic.");
    }
}