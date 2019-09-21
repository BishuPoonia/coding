import java.util.Scanner;
class fruits
{
 
 
    public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
 
		//Deciding the total number of fruits
		System.out.print("Enter how many fruits are there: ");
		int numOfFruits = Integer.parseInt(scan.nextLine());
 
		//Create a string array to store the names of fruits
		String arrayOfNames[] = new String[numOfFruits];
        for (int i = 0; i < arrayOfNames.length; i++) 
        {
			System.out.print("Enter the name of fruit " + (i+1) + " : ");
		        arrayOfNames[i] = scan.nextLine();
		}
		    
		//Now show the fruit name one by one
        for (int i = 0; i < arrayOfNames.length; i++) 
            {
			System.out.print("Fruit " + (i+1) + " : ");
		        System.out.print(arrayOfNames[i] + "\n");
		    }
		  
	}
 
}