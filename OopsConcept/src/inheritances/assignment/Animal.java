package inheritances.assignment;

public class Animal {

	private float height;
	private String color;
	private String noise;
	private String hair;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(float height, String color, String noise, String hair) {
		super();
		this.height = height;
		this.color = color;
		this.noise = noise;
		this.hair = hair;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public String getHair() {
		return hair;
	}

	public void setHair(String hair) {
		this.hair = hair;
	}

	@Override
	public String toString() {
		return "Animal [height=" + height + ", color=" + color + ", noise=" + noise + ", hair=" + hair + "]";
	}

}
