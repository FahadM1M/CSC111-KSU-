package Lab5;
import java.util.Scanner;

public class Validition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter student name: ");
		String name = input.nextLine();
		
		System.out.print("Enter mark1: ");
		int mark1 = input.nextInt();

		System.out.print("Enter mark2: ");
		int mark2 = input.nextInt();

		System.out.print("Enter mark3: ");
		int mark3 = input.nextInt();

		double average = (mark1 + mark2 + mark3) / 3.0 ;
		if ( average >= 60 ) {
			System.out.println("Student's name " + name);
			System.out.printf("Average = %.2f\n", average);
		}
		else {
			System.out.print("Try Again");
		}
	}

}
