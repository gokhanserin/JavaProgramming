package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        // store the elements: 10, 20, 50, 70

        int[] numbers = {10, 20, 50, 70};
        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------");

        // create a variable that can contain 5 scores

        int[] scores = new int[5];
        scores[1] = 85;
        scores[scores.length-1] = 75;
        scores[3] = 95;
        scores[0] = 60;
        scores[2] =80;

        System.out.println(Arrays.toString(scores));

        System.out.println("-------------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        System.out.println("-------------------------------");

        for (int i = months.length-1; i >=0 ; i--) {
            System.out.println(months[i]);
        }



    }


}
