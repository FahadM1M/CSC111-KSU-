package Lab10;

public class Circle {

	double radius;
	
	public double calculateArea() {
		System.out.print("Area: ");
		return radius * radius * 3.14;
		
	}
	public  void displayRadius() {
		System.out.println("Radius: " + radius);
		
	}
}