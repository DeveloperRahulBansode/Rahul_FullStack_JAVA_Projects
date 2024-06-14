package abstraction.study.assignment.architecture;

public abstract class BankAccount {
	private String accHolderName;
	private int accNo;
	private String branch;
	
	public BankAccount() {
		super();
	}

	public BankAccount(String accHolderName, int accNo, String branch) {
		super();
		this.accHolderName = accHolderName;
		this.accNo = accNo;
		this.branch = branch;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public abstract void printAccDetails();
	
	
	
	@Override
	public String toString() {
		return "BankAccount [accHolderName=" + accHolderName + ", accNo=" + accNo + ", branch=" + branch + "]";
	}
	
	

}
