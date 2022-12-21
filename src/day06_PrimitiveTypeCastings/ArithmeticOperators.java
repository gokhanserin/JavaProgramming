package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1);   // 121, Concatenation;

        System.out.println(10+20);   // 30, Addition;
        System.out.println(100-50);  // 50, Subtraction;
        System.out.println(10*6);    // 60, Multiplication;

        System.out.println(100/3);   // 33
        System.out.println(10.0/4);  // 2.5
        System.out.println(10/4.0);  // 2.5
        System.out.println(10d/4);   // 2.5

        int a=100;
        double b= a/6;  // 16.0
        System.out.println(b);

        double c = (double)a/6; // 16.666666
        System.out.println(c);

        System.out.println(100D);

        System.out.println(20%3);
        System.out.println(20%5);
        System.out.println(20%6);

    }


}

/*
+ : Addition
- : Subtraction
* : Multiplication
/ : Division

    integer / integer ------> integer
    integer / decimal ======> decimal
    decimal / integer ======> decimal
    decimal / decimal ======> decimal

    im math:
    10/4 = 2.5
    100/3 = 33.33333...

    in Java:
    10/4 = 2
    10.0/4 = 2.5
    100/3 = 33

% : Remainder

    in math:
    10/4=2.5;
    remainder = numerator - (denominator * integer result)
                10      -   (4 * 2)
                10      -  8
                2
 */