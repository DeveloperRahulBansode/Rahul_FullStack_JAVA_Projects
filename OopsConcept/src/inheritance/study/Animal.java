package inheritance.study;

public class Animal {

	private float height;
	private String color;
	private String noise;

	public Animal() {
	}

	public Animal(float height, String color, String noise) {
		super();
		this.height = height;
		this.color = color;
		this.noise = noise;
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
	

	@Override
	public String toString() {
		return "Animal [height=" + height + ", color=" + color + ", noise=" + noise + "]";
	}
	

}
