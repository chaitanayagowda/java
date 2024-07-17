class Factorial{
	public static int runfactorial(int factNumber){
		System.out.println("fact method started");
		int fact = 1;
		for(int num = 1;num<=factNumber;num++){
			fact = num * fact;
		}
		System.out.println("fact method ended :");
		return fact;
}
}