package Lab7;

import java.util.Scanner;

public class Weekends {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day’s name: ");
        String day = input.nextLine();

        if (day.equalsIgnoreCase("Friday") || day.equalsIgnoreCase("Saturday")) {
            System.out.println("Weekend!");
        }
        else if (day.equalsIgnoreCase("Sunday")) {
            System.out.println("5 days until the next weekend.");
        }
        else if (day.equalsIgnoreCase("Monday")) {
            System.out.println("4 days until the next weekend.");
        }
        else if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println("3 days until the next weekend.");
        }
        else if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println("2 days until the next weekend.");
        }
        else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("1 day until the next weekend.");
        }
        else {
            System.out.println("Incorrect day.");
        }

    }
}