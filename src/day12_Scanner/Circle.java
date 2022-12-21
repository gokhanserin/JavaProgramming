package day12_Scanner;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = input.nextDouble();
        double area = PI*radius*radius;
        double perimeter = 2*PI*radius;

        System.out.println("Area of the circle is: " + area);
        System.out.println("Perimeter of the circle is: " + perimeter);

        input.close();

    }

}
