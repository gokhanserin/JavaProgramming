package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();

        System.out.println("Enter a math operator:");
        char operator = input.next().charAt(0);

        if (!(operator=='+' || operator=='-')){
            System.err.println("Invalid operator!");
            System.exit(0);
        }

        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        if (operator=='+') {
            System.out.println(num1 + num2);
        }else{
            System.out.println(num1-num2);
        }

    }


}
