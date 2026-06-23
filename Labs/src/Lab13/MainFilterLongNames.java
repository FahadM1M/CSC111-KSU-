package Lab13;

import java.util.Scanner;

public class MainFilterLongNames {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of names: ");
		int size = scanner.nextInt();

		String[] names = new String[size];
		System.out.println("Enter the names:");
		for (int i = 0; i < size; i++) {
			names[i] = scanner.next();
		}

		String[] longNames = FilterLongNames.filterLongNames(names);

		System.out.println("Name(s) longer than 5 characters:");
		for (int i = 0; i < longNames.length; i++) {
			System.out.println(longNames[i]);
		}
	}
}