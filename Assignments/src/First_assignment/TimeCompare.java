package First_assignment;
import java.util.Scanner;

// I GOT 2.42/2.5 IN THIS HOMEWORK! TIP - DON'T RELAY ON THE SAMPLE RUN ONLY
// I FORGOT WHAT I DID WRONG (ᵕ—ᴗ—).


public class TimeCompare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the units (hr_min, day_hr, sec_millisec): ");
        String unit = input.next();
        unit = unit.toLowerCase();

        if (unit.compareTo("hr_min") != 0 && unit.compareTo("day_hr") != 0 && unit.compareTo("sec_millisec") != 0) {
            System.out.println("Invalid operation");
            return;
        }

        System.out.print("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if (unit.compareTo("hr_min") == 0) {

            double minutes1 = num1 * 60;
            double minutes2 = num2;

            if (minutes1 > minutes2) { 
                double otherInHours = num2 / 60;
                System.out.println(num1 + " hours is greater than " + otherInHours + " hours");
            }
            else if (minutes2 > minutes1) {
                double otherInMinutes = num1 * 60;
                System.out.println(num2 + " minutes is greater than " + otherInMinutes + " minutes");
            }
            else {
                System.out.println(num1 + " hours is equal to " + num2 + " minutes");
            }
        }
        if (unit.compareTo("day_hr") == 0) {

            double hours1 = num1 * 24;
            double hours2 = num2;

            if (hours1 > hours2) {
//                System.out.println(hours1 + " hours is greater than " + hours2 + " hours");
              System.out.println(num1 + " days is greater than " + hours2/24 + " days");

            }
            else if (hours2 > hours1) {
                System.out.println(hours2 + " hours is greater than " + hours1 + " hours");
            }
            else {
                System.out.println(num1 + " days is equal to " + num2 + " hours");
            }
        }

        if (unit.compareTo("sec_millisec") == 0) {

            double milli1 = num1 * 1000;
            double milli2 = num2;

            if (milli1 > milli2) {
                System.out.println(milli1 + " milliseconds is greater than " + milli2 + " milliseconds");
            }
            else if (milli2 > milli1) {
                System.out.println(milli2 + " milliseconds is greater than " + milli1 + " milliseconds");
            }
            else {
                System.out.println(num1 + " seconds is equal to " + num2 + " milliseconds");
            }
        }

        input.close();
    }
}