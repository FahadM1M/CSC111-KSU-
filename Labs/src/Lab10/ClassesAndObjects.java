package Lab10;

import java.util.Scanner;

public class ClassesAndObjects {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		Circle r = new Circle();
		
		r.radius = input.nextDouble();
		r.displayRadius();
		System.out.println(r.calculateArea());

	}

}
