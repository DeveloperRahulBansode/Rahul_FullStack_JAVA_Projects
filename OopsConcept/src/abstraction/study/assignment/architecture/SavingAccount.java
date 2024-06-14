package abstraction.study.assignment.architecture;

public class SavingAccount extends BankAccount {
	public static float intrestValue;
	public static float depositAmount;
	

	@Override
	public void printAccDetails() {
		System.out.println("Enter Account Holder Name="+getAccHolderName());
		System.out.println("Enter Account Number="+getAccNo());
		System.out.println("Enter Branch="+getBranch());
		System.out.println("Intrest Value="+intrestValue+"%");
		System.out.println("Deposit Ammount="+"Rs."+depositAmount);
	}


	@Override
	public String toString() {
		return "SavingAccount [getAccHolderName()=" + getAccHolderName() + ", getAccNo()=" + getAccNo()
				+ ", getBranch()=" + getBranch() + ", toString()=" + super.toString() +  "]";
	}
	

}
