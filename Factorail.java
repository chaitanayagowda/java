class Factorail{
	public static int getFact(int factNumber)
	{
		int fact = 1;
		System.out.println("fact method started");
		for(int num = 1; num <= factNumber; num++)
		{
			fact = num * fact;
		}
		System.out.println("fact nethod ended");
		return fact;
	}
	
	public static int totalNumberOfThings(int factNumber, int numThing )
	{
		System.out.println("Total Number of Things Started");
		int numThings = factNumber - numThing;
		System.out.println("Total Number of Things Ended");
		
		return numThings;
	}

}