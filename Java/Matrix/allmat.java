import java.util.Scanner;

// import javax.lang.model.util.ElementScanner6;

class allmat

{
    public static void main(String[] args)

    {
        int x = 5; // Limit of matrix order
        int[][] A = new int[x][x];
        int[][] B = new int[x][x];
        int[][] C = new int[x][x];
        int rowA,colA,rowB,colB;
        int operation, i, j, k;
        Scanner scan = new Scanner(System.in);

        System.out.println("The limit for matrices are "+x+"x"+x+" and shall not be exceeded!");

        // Options for Arithematic Operation
        System.out.println("Please select an operation from below i.e. to be performed: ");
        System.out.println("\n\t1\tAddition\n\t2\tSubstraction\n\t3\tTranspose\n\t4\tMultiplication\n");
        System.out.print("Enter any ONE of the option (number) here: ");
        operation = scan.nextInt();

        // Switch starts here

        switch(operation)
            {
                case 1: // Addition of two matrices

                        // Order of Matrix A
                        System.out.println("Matrix A: ");
                        System.out.println("Enter the number of row: ");
                        rowA = scan.nextInt();
                        System.out.println("Enter the number of column: ");
                        colA = scan.nextInt();
                        System.out.println("Order of matrix A is :"+rowA+"x"+colA+"\n");

                        if (rowA > x | colA > x)
                        {
                            System.out.println("\nError!!\nNumber of rows and columns must be less than "+x+"x"+x+"\n\nProgram is terminating...\nDone.");
                            return;
                        }

                        // Order of Matrix B
                        System.out.println("Matrix B: ");
                        System.out.println("Enter the number of row: ");
                        rowB = scan.nextInt();
                        System.out.println("Enter the number of column: ");
                        colB = scan.nextInt();
                        System.out.println("Order of matrix B is :"+rowB+"x"+colB+"\n");

                        if (rowB > x | colB > x)
                        {
                            System.out.println("\nError!!\nNumber of rows and columns must be less than "+x+"x"+x+"\n\nProgram is terminating...\nDone.");
                            return;
                        }

                        // Input for matrices

                        if(rowA == rowB && colA == colB)
                        {
                            System.out.println("\nEnter the elements for matrix A:");
                            for(i = 0; i < rowA; i++)
                            {
                                for(j = 0; j < colA; j++)
                                    { 
                                    A[i][j] = scan.nextInt();
                                    }
                                }
                                System.out.println("\nMatrix A:");
                                for(i = 0; i < rowA; i++)
                                {
                                    for(j = 0; j < colA; j++)
                                        {
                                        System.out.print(A[i][j]+" ");
                                        }
                                        System.out.println();
                                }

                                System.out.println("\nEnter the values for matrix B:");
        
                                for(i = 0; i < rowB; i++)
                                    {
                                        for(j = 0; j < colB; j++)
                                            {
                                             B[i][j] = scan.nextInt();
                                            }
                                    }
                                        System.out.println("\nMatrix B: ");
                                        for(i = 0; i < rowB; i++)
                                        {
                                        for(j = 0; j < colB; j++)
                                            {
                                            System.out.print(B[i][j]+" ");
                                            }
                                            System.out.println();
                                    }    

                            // Output of Addition result matrix
                            System.out.println("\nAddition of matrix A & B is: ");
                            for(i = 0; i < rowA; i++)
                            {
                                for(j = 0; j < colA; j++)
                                {
                                C[i][j] = A[i][j] + B[i][j];
                                System.out.print(C[i][j]+" ");
                                }
                                System.out.println();
                            }
                        }
                        else
                        {
                            System.out.println("Order of matrix is not equal. Thus, addition of matrix A and matrix B is not possible!");
                        }
                        break;
                case 2: // Substraction of two matrices

                        // Order of Matrix A
                        System.out.println("Matrix A: ");
                        System.out.println("Enter the number of row: ");
                        rowA = scan.nextInt();
                        System.out.println("Enter the number of column: ");
                        colA = scan.nextInt();
                        System.out.println("Order of matrix A is :"+rowA+"x"+colA+"\n");

                        if (rowA > x | colA > x)
                        {
                            System.out.println("\nError!!\nNumber of rows and columns must be less than "+x+"x"+x+"\n\nProgram is terminating...\nDone.");
                            return;
                        }

                        // Order of Matrix B
                        System.out.println("Matrix B: ");
                        System.out.println("Enter the number of row: ");
                        rowB = scan.nextInt();
                        System.out.println("Enter the number of column: ");
                        colB = scan.nextInt();
                        System.out.println("Order of matrix B is :"+rowB+"x"+colB+"\n");

                        if (rowB > x | colB > x)
                        {
                            System.out.println("\nError!!\nNumber of rows and columns must be less than "+x+"x"+x+"\n\nProgram is terminating...\nDone.");
                            return;
                        }

                        // Input for matrices

                        if(rowA == rowB && colA == colB)
                        {
                            System.out.println("\nEnter the elements for matrix A:");
                            for(i = 0; i < rowA; i++)
                            {
                                for(j = 0; j < colA; j++)
                                    { 
                                    A[i][j] = scan.nextInt();
                                    }
                                }
                                System.out.println("\nMatrix A:");
                                for(i = 0; i < rowA; i++)
                                {
                                    for(j = 0; j < colA; j++)
                                        {
                                        System.out.print(A[i][j]+" ");
                                        }
                                        System.out.println();
                                }

                                System.out.println("\nEnter the values for matrix B:");

                                for(i = 0; i < rowB; i++)
                                    {
                                        for(j = 0; j < colB; j++)
                                            {
                                            B[i][j] = scan.nextInt();
                                            }
                                    }
                                        System.out.println("\nMatrix B: ");
                                        for(i = 0; i < rowB; i++)
                                        {
                                        for(j = 0; j < colB; j++)
                                            {
                                            System.out.print(B[i][j]+" ");
                                            }
                                            System.out.println();
                                    }    

                            // Output of substraction result matrix
                            System.out.println("\nSubstraction of matrix A & B is: ");
                            for(i = 0; i < rowA; i++)
                            {
                                for(j = 0; j < colA; j++)
                                {
                                C[i][j] = A[i][j] - B[i][j];
                                System.out.print(C[i][j]+" ");
                                }
                                System.out.println();
                            }
                        }
                        else
                        {
                            System.out.println("Order of matrix is not equal. Thus, substraction of matrix A and matrix B is not possible!");
                        }
                        break;
                case 3: // Transpose of a matrix

                        // Taking order of matrix
                        System.out.println("Matrix : ");
                        System.out.println("Enter the number of row: ");
                        rowA = scan.nextInt();
                        System.out.println("Enter the number of column: ");
                        colA = scan.nextInt();
                        System.out.println("Order of matrix is :"+rowA+"x"+colA+"\n");

                        // Input for matrix
                        System.out.println("\nEnter the elements for matrix:");
                        for(i = 0; i < rowA; i++)
                        {
                            for(j = 0; j < colA; j++)
                                { 
                                A[i][j] = scan.nextInt();
                                }
                            }

                        // Output for matrix
                            System.out.println("\nMatrix before transpose: ");
                            for(i = 0; i < rowA; i++)
                            {
                                for(j = 0; j < colA; j++)
                                    {
                                    System.out.print(A[i][j]+" ");
                                    }
                                    System.out.println();
                            }
                            System.out.println("\nMatrix after transpose: ");
                            for(i = 0; i < colA; i++)
                            {
                                for(j = 0; j < rowA; j++)
                                    {
                                    System.out.print(A[j][i]+" ");
                                    }
                                    System.out.println();
                            } 
                        break;
                case 4: // Multiplication of two matrices

                            // Order of Matrix A
                            System.out.println("Matrix A: ");
                            System.out.println("Enter the number of row: ");
                            rowA = scan.nextInt();
                            System.out.println("Enter the number of column: ");
                            colA = scan.nextInt();
                            System.out.println("Order of matrix A is :"+rowA+"x"+colA+"\n");

                            if (rowA > x | colA > x)
                            {
                                System.out.println("\nError!!\nNumber of rows and columns must be less than "+x+"x"+x+"\n\nProgram is terminating...\nDone.");
                                return;
                            }

                            // Order of Matrix B
                            System.out.println("Matrix B: ");
                            System.out.println("Enter the number of row: ");
                            rowB = scan.nextInt();
                            System.out.println("Enter the number of column: ");
                            colB = scan.nextInt();
                            System.out.println("Order of matrix B is :"+rowB+"x"+colB+"\n");

                            if (rowB > x | colB > x)
                            {
                                System.out.println("\nError!!\nNumber of rows and columns must be less than "+x+"x"+x+"\n\nProgram is terminating...\nDone.");
                                return;
                            }

                            // Input for matrices

                            if(colA == rowB)
                            {
                            System.out.println("\nEnter the elements for matrix A:");
                            for(i = 0; i < rowA; i++)
                                {
                                for(j = 0; j < colA; j++)
                                    { 
                                    A[i][j] = scan.nextInt();
                                    }
                                }
                                System.out.println("\nMatrix A:");
                                for(i = 0; i < rowA; i++)
                                {
                                    for(j = 0; j < colA; j++)
                                        {
                                        System.out.print(A[i][j]+" ");
                                        }
                                        System.out.println();
                                }

                                System.out.println("\nEnter the values for matrix B:");
        
                                for(i = 0; i < rowB; i++)
                                    {
                                        for(j = 0; j < colB; j++)
                                            {
                                             B[i][j] = scan.nextInt();
                                            }
                                    }
                                        System.out.println("\nMatrix B: ");
                                        for(i = 0; i < rowB; i++)
                                        {
                                        for(j = 0; j < colB; j++)
                                            {
                                            System.out.print(B[i][j]+" ");
                                            }
                                            System.out.println();
                                    }
                                    
                                    // Output of product matrix 
                                    for(i = 0; i <= rowA; i++)
                                    {
                                        for(j = 0; j <= colB; j++)
                                        {
                                            C[i][j] = 0;
                                            for(k = 0; k < colA; k++)
                                            {
                                                C[i][j] +=  A[i][k] * B[k][j];
                                            }
                                        }
                                    }
                                    System.out.println("\nProduct of matrix A & B is: ");
                                    for(i = 0; i < rowA; i++)
                                    {
                                        for(j = 0; j < colB; j++)
                                        {
                                            System.out.print(C[i][j]+" ");
                                        }
                                                System.out.println();
                                    }
                                }
                                else
                                {
                                    System.out.println("Order (C1xR2) or (R1xC2) of matrix is not equal. Thus, multiplication of matrix A and matrix B is not possible!");
                                }
                        break;
                default:
                        System.out.println("Not an option that I know, please try again!!");
                        break;
            }
    }
}