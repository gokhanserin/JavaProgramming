package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 5, b = 4, c = 40;

        boolean bac = (b<a && a<c) || (c<a && a<b);  // boolean aisMedian
        boolean abc = (a<b && b<c) || (c<b && b<a);  // boolean bisMedian
        boolean acb = !bac & !abc;                  // boolean cisMedian


        if (bac) {
            System.out.println(a + " is the median number");
        }

        if (abc) {
            System.out.println(b + " is the median number");
        }


        if (acb) {
            System.out.println(c + " is the median number");
        }


/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
 */


    }


}
