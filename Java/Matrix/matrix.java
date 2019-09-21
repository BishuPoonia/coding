import java.util.Scanner;
class matrix
{
    public static void main(String args[])
    {
        int arr[][] = new int[10][10];
        int row,column;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert row: ");
        row = scan.nextInt();
        System.out.println("Insert column: ");
        column = scan.nextInt();
        System.out.println("Order of Matrix ="+row+"x"+column);

        
        for(int i = 0; i < row ; i++)
            {
                for (int j = 0; j < column; j++)
                    {
                        System.out.println("Enter value:");
                        arr[i][j] = scan.nextInt();
                    }
            }
            for(int i = 0; i < row; i++)
                {
                    for (int j = 0; j < column; j++)
                        {
                            System.out.print(arr[i][j]+"  ");
                        }
                    System.out.print("\n");
                }
    }
}