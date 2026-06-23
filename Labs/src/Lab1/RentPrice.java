package Lab1;

import java.util.Scanner;

public class RentPrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of days: ");
		int Days = input.nextInt();
		
		System.out.print("Enter the rent per day: ");
		double RentPerDay = input.nextDouble();
		
		double Discount = 0.01 * Days;
		double Tax = 0.15;
		double PriceBeforeTax = (Days * RentPerDay) * (1 - Discount);
		double RentPrice = PriceBeforeTax + (PriceBeforeTax * Tax);
		
		System.out.print("Rent price: " + RentPrice +" SAR");
	}

}