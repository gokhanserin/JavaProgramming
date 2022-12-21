package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
            System.out.println("Would you like to enter a new number?");
            String a = input.next();

            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry!");
                System.exit(0);
            }

            if (a.equalsIgnoreCase("no"))
                System.out.println("Thank you for using the calculator!");
            break;
        }


    }


}
