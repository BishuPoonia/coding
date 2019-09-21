import java.util.Scanner;

class Distance
{
		int feet;
		int inch;

		public void getdata()
		{
			Scanner scan1 = new Scanner(System.in);
			System.out.print("Feet = ");
			feet = scan1.nextInt();
			Scanner scan2 = new Scanner(System.in);
			System.out.print("Inch = ");
			inch = scan2.nextInt();
		}

		public void showdata()
			{
				System.out.println("Feet = "+feet+"\tInches = "+inch);
			}
		
		public void adddata(Distance D1, Distance D2)
		{
			inch = D1.inch + D2.inch;
			feet = D1.feet + D2.feet + (inch/12);
			inch = inch%12;
		}
}

public class AddTwoDistance
{
	public static void main(String args[])
	{
		Distance D1 = new Distance();
		Distance D2 = new Distance();
		Distance D3 = new Distance();

		System.out.println("Enter the first distance: ");
		D1.getdata();
		System.out.println("Enter the second distance: ");
		D2.getdata();
		D3.adddata(D1,D2);
		System.out.println("Addition of both distance: ");
		D3.showdata();
	}
}
