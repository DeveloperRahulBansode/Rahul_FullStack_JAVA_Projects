package method.overriding;

public class Parent {

	private String proffession;

	public String getProffession() {
		return proffession;
	}

	public void setProffession(String proffession) {
		this.proffession = proffession;
	}

	public void printProffession() {
		System.out.println("Proffession of Parent=" + proffession);
	}

}
