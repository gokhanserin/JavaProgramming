package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test1 started");

        try {
            System.out.println(9/0);
            System.out.println("Try block");

        }catch (ArithmeticException e){

            System.out.println("Catch block");
            System.out.println("Arithmetic exception was occurred");
        }


        System.out.println("Test1 completed");

        System.out.println("----------------------------------");

        System.out.println("Test 2 started");

        int[] numbers ={1,2,3,4,5};


        try {
            System.out.println(numbers[90]);
            System.out.println("Try block");

        }catch (RuntimeException e){
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }

        System.out.println("Test 2 completed");

        System.out.println("-----------------------------------");

        System.out.println("Test 3 started");

        try {
            System.out.println("Cydeo".substring(2, 0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test 3 completed");

        System.out.println("-----------------------------------");

        System.out.println("Hello");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cydeo");

        System.out.println("-----------------------------------");

        try {
            FileInputStream file = new FileInputStream("Fie path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
