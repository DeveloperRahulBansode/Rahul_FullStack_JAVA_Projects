package com.method.overriding;

public class MainPlanetEarth {

	public static void main(String[] args) {

		Earth earth = new Earth();
		earth.setPopulation(987654);
		earth.setradius(3959.1F);

		Planet planet = new Planet();
		planet.setType("habitable");
		planet.setradius(5937.12F);

		earth.earthPopulation();
		earth.printAreaOfPlanet();// subclass/child class method that override the method of super class (planet)

		planet.typeOfPlanet();
		planet.printAreaOfPlanet();

	}

}
