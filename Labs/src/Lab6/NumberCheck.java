package Lab6;

import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        int number = scanner.nextInt();
                
        if (number % 2 != 0) {
        	
            System.out.println("The number is odd.");

            return; 
        } 
        
        else {
            if (number % 3 == 0) {
                System.out.println("The number is even and divisible by 3."); }
            else {
                    System.out.println("The number is even.");
                }
            }
        }
    }