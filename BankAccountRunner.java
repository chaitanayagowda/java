class bankAccountRunner{

public static void main(String []sbi){

bankAccount.credit(2000);
double getvalue = bankAccount.getBalance();
bankAccount.credit(8000);
getvalue = bankAccount.getBalance();
bankAccount.credit(10000);
getvalue = bankAccount.getBalance();
bankAccount.debit(7000);
getvalue = bankAccount.getBalance();
bankAccount.debit(3000);
getvalue = bankAccount.getBalance();
System.out.println("balance is:"+getvalue);



}


}