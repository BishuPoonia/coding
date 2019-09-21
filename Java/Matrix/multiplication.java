import java.util.Scanner;

class multiplication

{
    public static void main(String[] args)

    {
        int[][] array = new int[5][5];
        int[][] array1 = new int[5][5];
        int[][] c = new int[5][5];
        int row,col,row1,col1;
        int i, j, k;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of Row: ");
        row = scan.nextInt();
        System.out.println("Enter the number of Column: ");
        col = scan.nextInt();
        System.out.println("Order of matrix is :"+row+"x"+col+"\n");
        System.out.println("Enter the elements for Matrix A:");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
                { 
                array[i][j] = scan.nextInt();
                }
        }
   System.out.println("Matrix A is:");
    for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
                {
                System.out.print(array[i][j]+" ");
                }
                System.out.println();
        }
        System.out.println("Enter the number of row: ");
        row1 = scan.nextInt();
        System.out.println("Enter the number of Column: ");
        col1 = scan.nextInt();
        System.out.println("Order of matrix is :"+row1+"x"+col1+"\n");
        System.out.println("Enter the values for Matrix B:");
        
            for(i = 0; i < row1; i++)
                {
                    for(j = 0; j < col1; j++)
                        {
                         array1[i][j] = scan.nextInt();
                        }
                }
           System.out.println("Matrix B: ");
            for(i = 0; i < row1; i++)
                {
                    for(j = 0; j < col1; j++)
                        {
                        System.out.print(array1[i][j]+" ");
                        }
                        System.out.println();
                }    
            if(col != row1)
                {
                    System.out.println("Order of Matrix is not Equal. Thus, multiplicataion of Matrix A and Matrix B is not possible!");
                }
            else
            {    
           System.out.println("Multiplication of Matrix A & B: ");
                
            for(i = 0; i <= row; i++)
            {
                for(j = 0; j <= col1; j++)
                {
                    c[i][j] = 0;
                    for(k = 0; k < col; k++)
                    {
                        c[i][j] +=  array[i][k] * array1[k][j];
                    }
                }
            }
            for(i = 0; i < row; i++)
            {
                for(j = 0; j < col1; j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                        System.out.println();
            }
            }
    }
}
