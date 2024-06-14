package string.study;

public class MatchesString {
	private String name;
	
	public MatchesString() {}
	
	public MatchesString(String name) {
		this.name=name;
	}
	
	public void matchString() {
		if(name.matches("[A-Z][a-z]{1,29}")) {
			System.out.println("valid Name");
			
		}else {
			System.out.println("Invalid Name");
		}
	}
	
	

}

