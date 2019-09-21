/*
    Printing Array using funtion
    Friday 19th July 2018 
*/
class larg

{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,45,6};
        larg(arr, 5 );
    }

    private static void larg(int[] arr, int total)
    {
        int num = arr[0];
        for(int i = 1; i < total; i++)
            {
                if(num<arr[i])
                    num = arr[i];
            }
                System.out.println("The Largest in array is: " + num);
    }
}