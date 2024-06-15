package functional.interfaces.study;

public class MainPlanets {
	public static void main(String[] args) {
		
		
		Planets earth=radius->4*3.14F*radius*radius;
		Planets moon=radius->4*3.14F*radius*radius;
		Planets mars=radius->4*3.14F*radius*radius;
		Planets pluto=radius->4*3.14F*radius*radius;
		Planets jupiter=radius->4*3.14F*radius*radius;
		
		System.out.println(earth.areaOfPlanet(15.5F));
		System.out.println(moon.areaOfPlanet(20.5F));
		System.out.println(mars.areaOfPlanet(75.5F));
		System.out.println(pluto.areaOfPlanet(10.5F));
		System.out.println(jupiter.areaOfPlanet(150.5F));

		
		
	}

}
