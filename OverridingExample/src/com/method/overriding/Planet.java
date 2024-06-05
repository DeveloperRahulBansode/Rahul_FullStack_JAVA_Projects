package com.method.overriding;

public class Planet {
	// Instance VARIABLE
	private String type;
	private float radius;

	// GETTERS AND SETTERS
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getradius() {
		return radius;
	}

	public void setradius(float radius) {
		this.radius = radius;
	}

	// BEHAVIOR/METHOD

	public void typeOfPlanet() {
		System.out.println("Type of planet =" + getType());
	}

	public void printAreaOfPlanet() throws RuntimeException {
		 System.out.println("Area of planet =" + (4 * 3.14 * radius * radius));
	}

}
