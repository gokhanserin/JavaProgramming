package day21;

import java.util.Arrays;

public class ReverseArrays {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40};
        int[] reversed = new int [4];

        /*       i            j
        reversed[0] = numbers[3];
        reversed[1] = numbers[2];
        reversed[2] = numbers[1];
        reversed[3] = numbers[0];
        */

        for (int j = numbers.length-1, i=0; j >= 0 ; j--, i++) {
            reversed [i] = numbers[j];

        }
        System.out.println(Arrays.toString(reversed));

    }


}
