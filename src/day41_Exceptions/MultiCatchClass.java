package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchClass {

    public static void main(String[] args) {

        Employee employee = null;


        try {
            System.out.println(employee.getSalary());
        }catch (NullPointerException e){
            System.out.println("Catch 1 block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Catch 2 block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Catch 3 block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Catch 4 block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Catch 5 block");
            e.printStackTrace();
        }

        System.out.println("Test completed");

        System.out.println("------------------------------------");

        try {
            System.out.println("java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }


    }


}
