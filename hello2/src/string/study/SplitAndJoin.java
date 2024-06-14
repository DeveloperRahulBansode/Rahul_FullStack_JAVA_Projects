package string.study;

public class SplitAndJoin {

	private String address;
	private String msg;

	public SplitAndJoin() {
		msg="abc";
	}

	public SplitAndJoin(String address,String msg) {
		this.address = address;
		this.msg=msg;
	}
	public SplitAndJoin(String msg) {
		this.msg=msg;
	}

	public void splitAndJoinString() {
		String[] addComponent = address.split(" ");

		String newAddress = String.join("->", addComponent);

		System.out.println(newAddress);

	}
	
	public void ifChar() {
		for(int i=0; i<msg.length();i++) {
			if(msg.charAt(i)>='0' && msg.charAt(i)<='9'){
				continue;	
			}
			else {
				System.out.println(msg.charAt(i));
			}
		}
	}

}
