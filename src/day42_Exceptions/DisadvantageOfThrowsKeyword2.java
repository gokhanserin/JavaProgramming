package day42_Exceptions;

import java.io.FileInputStream;

public class DisadvantageOfThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException {

        method1();
        method2();
        method3();

        String str = null;
        try {
            System.out.println(str.charAt(0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

    }

    public static void method () {
        try {
            method1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws InterruptedException {
       // new FileInputStream("");
        Thread.sleep(3000);
    }

    public static void method2() throws InterruptedException {
        method1();
    }

    public static void method3() throws InterruptedException {
        method2();
        Thread.sleep(1500);
    }

    public static void method4() throws InterruptedException {
        method3();
    }
    public static void method5(){
        method();
    }


}
