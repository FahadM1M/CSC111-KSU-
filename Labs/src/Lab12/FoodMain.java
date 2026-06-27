package Lab12;

public class FoodMain {
	
	public static void main(String[] args) {
		
		Food obj1 = new Food("juice", 200, 20);

		Food obj2 = new Food();
		System.out.println("Reading data for Object 2:");
		obj2.readData();

		System.out.println("\n--- Information for Object 1 ---");
		obj1.displayInfo();

		System.out.println("\n--- Information for Object 2 ---");
		obj2.displayInfo();

		System.out.println("\nTotal Food objects created: " + Food.foodCount);
	}
}