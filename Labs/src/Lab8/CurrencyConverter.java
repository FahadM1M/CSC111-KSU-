package Lab8;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in);
        String continueChoice;

        do {
            System.out.print("Enter the amount in Riyals: ");
            double riyals = input.nextDouble();

            System.out.print("Enter the choice to convert USD or GBP: ");
            String choice = input.next();

            switch (choice.toUpperCase()) {
                case "USD":
                    double usd = riyals * 0.27;
                    System.out.printf("The amount in Dollars = %.2f USD, %d USD\n", usd, (int)usd);
                    break;

                case "GBP":
                    double gbp = riyals * 0.2;
                    System.out.printf("The amount in Pounds = %.2f GBP, %d GBP\n", gbp, (int)gbp);
                    break;

                default:
                    
                	System.out.println("Incorrect currency. USD or GBP only");
                    break;
            }

            System.out.print("Do you want to continue: ");
            continueChoice = input.next();

          
        } while (continueChoice.equals("yes") || 
                 continueChoice.equals("Yes") || 
                 continueChoice.equalsIgnoreCase("y"));

        input.close();
    }
	}
