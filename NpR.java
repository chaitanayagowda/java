class NpR
{
	public static void main(String npr[])
	{
		System.out.println("Main Method Started");
		//nPr = n!/(n-r)!
		int factNumber = 12; //total number
		int num = 6; // total number of ways
		
		
		int nPr = Factorial1.getFact(factNumber)/Factorial1.getFact(Factorial1.totalNumberOfThings(factNumber, num));
		
		System.out.println("The final result is " +nPr);
		System.out.println("Main Method Ended");
	}
	
}