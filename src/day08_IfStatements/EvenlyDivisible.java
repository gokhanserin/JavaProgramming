package day08_IfStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;
        boolean isDivisibleByTwo = 65 % 2 == 0;
        boolean isDivisibleByThree = 65 % 3 == 0;
        boolean isDivisibleByFive = 65 % 5 == 0;

        System.out.println(number + " is divisible by 2: " + isDivisibleByTwo);
        System.out.println(number + " is divisible by 3: " + isDivisibleByThree);
        System.out.println(number + " is divisible by 5: " + isDivisibleByFive);

/*
2. Create a class called EvenlyDivisible,and write a program that can
check if a number is evenly divisible by 2, 3, 5
Ex:
number = 65;
output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true
 */

        System.out.println("---------------------------------------------------");

        int year = 2000;
        boolean isLeapYear = 2000 % 4 == 0;
        System.out.println(year + " is a leap year: " + isLeapYear);

    }

}



