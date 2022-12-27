package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args)  {

        System.out.println("Hello");
        //sleep(1.5); // throws
        System.out.println("Hello world");

        System.out.println("--------------------------");

        System.out.println("Cydeo");
        MorningWorkOut.sleep(1.5); // try&catch
        System.out.println("Hello Batch 25");



    }

    public static void sleep(double seconds) throws InterruptedException {
        Thread.sleep(1500);
    }


}
