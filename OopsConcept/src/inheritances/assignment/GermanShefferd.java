package inheritances.assignment;

public class GermanShefferd extends Dog {
	int lifeSpan;
	String tails;
	String earShape;
	
	public GermanShefferd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GermanShefferd(float height, String color, String noise, String hair, int legs, String gender,int lifeSpan,String tails,String earShape) {
		super(height, color, noise, hair, legs, gender);
		this.lifeSpan=lifeSpan;
		this.tails=tails;
		this.earShape=earShape;
	}
	public int getLifeSpan() {
		return lifeSpan;
	}
	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	public String getTails() {
		return tails;
	}
	public void setTails(String tails) {
		this.tails = tails;
	}
	public String getEarShape() {
		return earShape;
	}
	public void setEarShape(String earShape) {
		this.earShape = earShape;
	}
	@Override
	public String toString() {
		return "GermanShefferd [lifeSpan=" + lifeSpan + ", tails=" + tails + ", earShape=" + earShape +", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
