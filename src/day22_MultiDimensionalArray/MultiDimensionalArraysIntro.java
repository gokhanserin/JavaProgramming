package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {

    public static void main(String[] args) {

        String[] group1 = {"Jon", "Joes", "James"};
        String[] group2 = {"Kelvin", "Melissa", "Victor"};
        String[] group3 = {"Brad", "Jesika", "Holmet"};

        String[][] groups = new String[3][];  // index 0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.deepToString(groups));

        System.out.println("--------------------------------------");

        /*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
        */

        int[][] arr2d = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        System.out.println(Arrays.toString(arr2d[1]));
        System.out.println(arr2d[2][3]);




    }


}
