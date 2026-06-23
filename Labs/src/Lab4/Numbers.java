package Lab4;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter a number between 0-10 or 90-100: ");
		int number = input.nextInt();
		
		if(number >= 0 && number <= 10) {
			System.out.println(number + " is a correct input");
		}
		else if(number >= 90 && number <= 100) {
			System.out.println(number + " is a correct input");
			
		}
		else{
			System.out.println( number +" is an invalid input");
			
		}

	}

}
