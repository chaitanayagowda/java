class NCR
{
	public static void main(String ncr[])
	{
		//nCr​=nPr​​ / r!= n!​ / (r! (n-r)!)
		int factNum = 12;
		int numOfThings = 5;
		int finalFactValue = Factorail.getFact(factNum);
		int finalNumOfThings = Factorail.getFact(numOfThings);
		int totalFactNumOfThings = Factorail.getFact(Factorail.totalNumberOfThings(factNum, numOfThings));
		
		
		System.out.println("Main Method stated");
		int finaResultOfNcr = finalFactValue /( finalNumOfThings * totalFactNumOfThings);
		System.out.println("The final Result of NCR is : " + finaResultOfNcr);
		
		System.out.println("Main Method ended");
	
	}


}