package method.overriding;

public class MainOverriding {
	public static void main(String[] args) {
		Child raju = new Child();
		raju.setProffession(" Developer");
		
		Parent dakumangalsingh=new Parent();
		dakumangalsingh.setProffession("DAKU");
		
		raju.printProffession();
		dakumangalsingh.printProffession();
		

	}

}
