package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int[][] arr2d = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int[] each1DArray : arr2d) {

            //System.out.println(Arrays.toString(each1DArray));
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }


    }


}
