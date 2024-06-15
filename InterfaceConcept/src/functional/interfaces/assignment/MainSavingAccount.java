package functional.interfaces.assignment;

public class MainSavingAccount {
	private static float balance=50000;
	
	public static void main(String[] args) {
		SavingAccount withdrawal=amount->MainSavingAccount.balance-amount;
		SavingAccount diposit=(amount)->MainSavingAccount.balance+amount;
		
		System.out.println("Balance Amount After Withdrawal="+withdrawal.transaction(10000F));
		System.out.println("Balance Amount After diposit="+diposit.transaction(50000F));
		
		
		
	}

}
