package Second_assignment;

import java.util.Scanner;

// I GOT 2.5/2.5 IN THIS ONE ദ്ദി( ˘̀ ֊ ˘́).

public class DataUsagePlanDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Enter customer name: ");
			String name = input.next();

			if (name.equalsIgnoreCase("exit")) {
				break;
			}

			System.out.print("Enter National ID: ");
			String id = input.next();

			char type;
			while (true) {
				System.out.print("Enter plan type ('L', 'S', or 'U'): ");
				type = input.next().toUpperCase().charAt(0);
				if (DataUsagePlan.isValidPlanType(type)) {
					break;
				}
				System.out.println("ERROR: Incorrect plan type. Type can be 'L', 'S', or 'U' only");
			}

			System.out.print("Enter used GB: ");
			int usedGB = input.nextInt();

			DataUsagePlan plan = new DataUsagePlan(name, id, type, usedGB);
			plan.displayInfo();
			System.out.println("====================");
		}
		input.close();
	}
}