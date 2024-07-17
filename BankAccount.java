class bankAccount{
static double balance ;

public static void credit(double amount){
	System.out.println("credit operation started");
	balance = balance + amount;
	System.out.println("credit operation ended");
}

public static void debit(double amount){
	System.out.println("debit operation started");
	balance = balance - amount;
	System.out.println("debit operation ended");
	
}
public static double getBalance(){
	System.out.println("the current balance is :"+balance);
	return balance;
}

}