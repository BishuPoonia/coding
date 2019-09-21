import java.util.Scanner;
class addmat
{
    public static void main(String arg[])
    {
        int[][] array = new int[5][5];
        int row, column,i,j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values for Row and Column: ");
        row = scan.nextInt();
        column = scan.nextInt();
           // if()
            {
            System.out.println("Elements in Matrix: ");
            for(i = 0; i < row; i++)
                {
                    for(j = 0; j < column; j++)
                        array[i][j]= scan.nextInt();
                }
            System.out.println("The Matrix is: ");
            for(i = 0; i < row; i++)
                {
                    for(j = 0; j < column; j++)
                        {
                        System.out.print(array[i][j]+" ");
                        }
                        System.out.println();
                }
            System.out.println("Transpose of Matrix: ");
            for(i = 0; i < row; i++)
                {
                    for(j = 0; j < column; j++)
                        {
                        System.out.print(array[j][i]+" ");
                        }
                        System.out.println();
                }
                System.out.println("Addition of Matrix: ");
                for(i = 0; i < row; i++)
                    {
                        for(j = 0; j < column; j++)
                            {
                                int c = array[i][j] + array[j][i];
                            System.out.print(c+" ");
                            }
                            System.out.println();
                    }
                    System.out.println("Substraction of Matrix: ");
                    for(i = 0; i < row; i++)
                        {
                            for(j = 0; j < column; j++)
                                {
                                    int d = array[i][j] - array[j][i];
                                System.out.print(d+" ");
                                }
                                System.out.println();
                        }
    }
}
}