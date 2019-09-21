
class array
{
    public static void main(String args[])
    {
        // Using regular "for" loop

        int[] array = {2,4,6,8,10};
        for(int i = 0; i<5; i++)
        {
           System.out.print(array[i]+" ");
        }
            System.out.println();
        
        // Using "enhanced for" loop, also known as "for each" loop
            
            int[] array2 = {10,8,6,4,2,};
            {
                for(int n: array2)
                    {
                        System.out.print(n+" ");
                    }
            }
    }    

}