package day25_CustomMethods_Overloading;

public class MethodOverloading {

    public static void main(String[] args) {

        int sum = sumOfNumbers(10,20);
        System.out.println(sum);

        double sum1 = sumOfNumbers(10.5,20.5);
        System.out.println(sum1);

        int sum2 = sumOfNumbers(10,20,30);
        System.out.println(sum2);

        double sum3 = sumOfNumbers(1.5,2.5,3.5);
        System.out.println(sum3);

        int sum4 = sumOfNumbers(10,20,30,40);
        System.out.println(sum4);

        double sum5 = sumOfNumbers(3.5,4.5,5.5,6.5);
        System.out.println(sum5);
    }

    public static int sumOfNumbers(int num1, int num2){


        return num1+num2;
    }

    public static double sumOfNumbers(double num1, double num2){


        return num1+num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3){

        return num1+num2+num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3){

        return sumOfNumbers(num1,num2)+num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4){

        return sumOfNumbers(num1,num2,num3)+num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4){

        return sumOfNumbers(num1,num2,num3)+num4;
    }

}
