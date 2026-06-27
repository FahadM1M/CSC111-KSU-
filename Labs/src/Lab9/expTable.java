package Lab9;

import java.util.Scanner;

public class expTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = input.nextInt();

        System.out.println("The Exponent Tables of first " + n + " numbers are");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                int result = 1;
                for (int k = 1; k <= j; k++) {
                    result *= i;
                }
                System.out.print(i + "^" + j + "=" + result + "\t");
            }
            System.out.println();
        }
        


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + "^" + j + "=" + (int)Math.pow(i, j) + "\t");
            }
            System.out.println();
        }
    }
}