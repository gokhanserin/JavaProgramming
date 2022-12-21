package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        while (true){
            System.out.println("Enter the first number:");
            int num1 = input.nextInt();

            System.out.println("Enter the second number:");
            int num2 = input.nextInt();

            System.out.println("Addition: " + (num1+num2));

            System.out.println("Do you want to continue?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){  // if the answer is invalid
                System.out.println("Invalid answer. Please re-enter:");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")){
                break; // exits the outer loop
            }


        }


    }


}
