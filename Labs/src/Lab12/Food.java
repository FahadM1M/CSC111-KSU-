package Lab12;

import java.util.Scanner;

public class Food {
	private String type;
	private double totalCal;
	private double fatCal;
	public static int foodCount = 0;

	public Food() {
		this.type = "";
		this.totalCal = 0;
		this.fatCal = 0;
		foodCount++;
	}

	public Food(String ty, double t, double f) {
		this.type = ty;
		this.totalCal = t;
		this.fatCal = f;
		foodCount++;
	}

	public void readData() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter food type: ");
		this.type = input.nextLine();
		System.out.print("Enter total calories: ");
		this.totalCal = input.nextDouble();
		System.out.print("Enter fat calories: ");
		this.fatCal = input.nextDouble();
	}

	public void displayInfo() {
		System.out.println("» Food Type: " + type);
		System.out.println("» Total Calories: " + totalCal);
		System.out.println("» Fat Calories: " + fatCal);
	}
}