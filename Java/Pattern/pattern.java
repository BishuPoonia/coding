/**      Pattern of Aterisks (Pyramid)
            Saturday 14th July 2018
*/

import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        int star;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size limit of Pyramid: ");
        star = s.nextInt();

        for(int i = 0; i < star; i++)
            {
                for (int j = i; j <= (star - 1); j++)
                    {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i; k++)
                        {
                        System.out.print("*"+" ");
                        }
                        System.out.println("");
            }
    }
}