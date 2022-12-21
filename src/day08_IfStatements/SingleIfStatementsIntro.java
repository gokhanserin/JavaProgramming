package day08_IfStatements;

public class SingleIfStatementsIntro {

    public static void main(String[] args) {

        int number = 301;

        boolean evennumber = number % 2 == 0;
        boolean oddnumber = !evennumber;  // not even number

        if (evennumber) {

            System.out.println(number + " is an even number");
        }

        if (oddnumber) {
            System.out.println(number + " is an odd number");
        }

        System.out.println("------------------------------------------------");

        int n = 200;

        // positive
            if (n>0) {
                System.out.println(n + " is positive");
            }
        // negative
            if (n<0) {
                System.out.println(n + " is negative");
            }
        // zero
            if (n==0) {
                System.out.println(n + " is zero");
            }


    }

}