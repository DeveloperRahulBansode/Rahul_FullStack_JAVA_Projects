package packages1;

public class ArithmeticOperationService {
	
	ArithmaticOperation obj=new ArithmaticOperation();
	ArithmaticOperation obj2=new ArithmaticOperation(30,40);

	public void addoperand() {
		obj.addoperand();
		obj2.addoperand();
	}
	public void suboperand() {
		obj.suboperand();
		obj2.suboperand();	
	}
	public void muloperand() {
		obj.muloperand();
		obj2.muloperand();
	}
	public void divoperand() {
		obj.divoperand();
		obj2.divoperand();
		
	}

}
