package abstraction.study.assignment.architecture;

public class MainBank {
	public static void main(String[] args) {
		CurrentAccount.depositAmount=2000.0F;
		CurrentAccount.intrestValue=10.0F;
		SavingAccount.depositAmount=3000.0F;
		SavingAccount.intrestValue=20.0F;
		
		BankAccount sbi=new CurrentAccount();
		sbi.setAccHolderName("Rahul Bansode");
		sbi.setAccNo(123456);
		sbi.setBranch("SBI Kalyan(East)");
		
		BankAccount sbi1=new SavingAccount();
		sbi1.setAccHolderName("Pratik Jige");
		sbi1.setAccNo(654321);
		sbi1.setBranch("SBI Kalyan(East)");
		
		sbi.printAccDetails();
		System.out.println();
		sbi1.printAccDetails();
		
		
		
		
	}

}
