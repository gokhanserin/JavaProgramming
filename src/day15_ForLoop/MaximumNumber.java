package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int maximum = -2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num= input.nextInt();
            if (num>maximum){
                maximum = num;

            }
        }
        System.out.println("maximum = " + maximum);
        input.close();
    }


}
/* Write a program that asks user to enter a number for 5 times.
Return the maximum number
 */