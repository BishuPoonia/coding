class reverse
{
	public static void main(String args[])
	{
		int number = 12345;
		int revnum = 0;
		int mod = 0;

		while (number > 0)
		{
			mod = number % 10;
			revnum = revnum * 10 + mod;
			number = number / 10;
		}
			System.out.println("Reverse of given number is: "+revnum);
	}
}
