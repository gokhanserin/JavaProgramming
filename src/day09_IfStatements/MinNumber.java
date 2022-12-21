package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

        // possibility #1 : n1 is min
        // possibility #2 : n2 is min
        // possibility #3 : equal
        int n1 = 400;
        int n2 = 400;

        boolean min1 = n1 < n2;
        boolean min2 = n2 < n1;
        boolean equal = n1 == n2;

        if (min1) {
            System.out.println(n1 + " is the minimum number");
        }
        if (min2) {
            System.out.println(n2 + " is the minimum number");
        }
        if (equal) {
            System.out.println(n1 + " and " + n2 + " are equal numbers");
        }

/*
1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */



    }


}
