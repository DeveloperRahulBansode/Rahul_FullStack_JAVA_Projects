package abstraction.study;

public abstract class HotelManu {
	private int srNo;

	public HotelManu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotelManu(int srNo) {
		super();
		this.srNo = srNo;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	//Create Abstract Class
	public abstract void displayManu();
	
	@Override
	public String toString() {
		return "HotelManu [srNo=" + srNo + "]";
	}
	
	
	

}
