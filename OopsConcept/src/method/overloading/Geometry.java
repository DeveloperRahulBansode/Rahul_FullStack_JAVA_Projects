
package method.overloading;
// The method having same name but different parameters.
public class Geometry {
	public void area(int height,int width) {
		System.out.println("Area of Rectangle :"+ (height*width));
	}
	public void area(int radius) {
		System.out.println("Area of Circle ="+ (3.14*radius*radius));
	}
	public void area(float radius) {
		System.out.println("Area of Circle ="+ (3.14*radius*radius));
	}
	
	//ambiguity
	
	public void area(float height,int width) {
		System.out.println("Area of REc="+(height*width));

	}


}
