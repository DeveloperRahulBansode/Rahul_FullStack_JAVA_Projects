package com.method.overriding;

public class Earth extends Planet {
	
	// Instance VARIABLE
	private int population;

	// BEHAVIOR/METHOD

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void earthPopulation() {
		System.out.println("population of Earth = " + getPopulation());
	}

	
	@Override
	public void printAreaOfPlanet() throws ArrayIndexOutOfBoundsException {
		float radius = getradius();
		System.out.println("Area of Earth = " + (4 * 3.14 * radius * radius));
	}

}
