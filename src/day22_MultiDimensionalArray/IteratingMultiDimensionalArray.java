package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        int[][] arr2d = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int i = 0; i < arr2d.length; i++) {
            System.out.println(Arrays.toString(arr2d[i]));
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

    }

}
