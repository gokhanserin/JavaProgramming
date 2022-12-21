package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLineMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String name = input.nextLine();  // Wooden Spoon Enter

        System.out.println("Enter your programming language:");
        String programming = input.nextLine();  // Java programming Enter

        System.out.println("Enter your age:");
        int age = input.nextInt();  // 45

        input.nextLine();  // capture the Enter key that use pressed for nextInt(), makes the memory empty of enter

        System.out.println("Enter your school name:");
        String school = input.nextLine();

        System.out.println("Full name: " + name);
        System.out.println("Programming: " + programming);
        System.out.println("Age: " + age);
        System.out.println("School name: " + school);

        input.close();

    }


}
