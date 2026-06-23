package Lab3;
import java.util.Scanner;

public class IncrementandDecrement {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter X value: ");
	double X = input.nextDouble();
	
	double result = ((++X * --X) - --X) / ((++X - --X) * ( 2 * X / X));
	
	System.out.print("The result is " + result);
	
	



	}

}
