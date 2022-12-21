package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // <, <=, >, >=

        boolean result1 = 20>40;   // false

        System.out.println("result1 = " + result1);;

        boolean result2 = 300 >= 200;
        System.out.println("result2 = " + result2);  // true
        boolean result3 = 100>=100;  // true
        System.out.println("result3 = " + result3);
        boolean result4 = 300>=500;  // false
        System.out.println("result4 = " + result4);

        // credit score of 720
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        System.out.println("------------------------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x == y;  // false
        //              100 = 200
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good guy"; // false
        System.out.println("result8 = " + result8);

        boolean result9 = "A" == "a";  // false
        System.out.println("result9 = " + result9);

        System.out.println("------------------------------------------------");

        boolean result11 = 100 != 200.5;  // true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break"; // true
        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300; //  false
        System.out.println("result13 = " + result13);




    }


}
