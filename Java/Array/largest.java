class largest
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,45,76};

        // Using swap method

        int lnum = 0;
        for(int i = 0; i < 5; i++)
            {
                for(int j = i + 1; j < 5; j++)
                    {
                        if(arr[i]>arr[j])
                        {
                        lnum = arr[i];
                        arr[i] = arr[j];
                        arr[j] = lnum;
                        }
                        else
                        {
                            lnum=arr[j];
                        }
                    }
            }

                System.out.println("Largest number = " + lnum + "\n");

                //Using stand-alone "if" statement

                int num = arr[0];
                for(int i = 1; i < 5; i++)
                    {
                        if(num<arr[i])
                            num = arr[i];
                    }
                        System.out.println("The Largest in array is: " + num);

    }                
}