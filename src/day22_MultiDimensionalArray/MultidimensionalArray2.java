package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultidimensionalArray2 {

    public static void main(String[] args) {

        int[] arr1 ={1,2,3};
        int[] arr2 ={4,5,6};
        int[] arr3 ={7,8,9};

        int[][] arr2D = { {1,2,3}, {4,5,6}, {7,8,9} };

        // 3D array contains 2D arrays.

        int[][][] arr3D = { { {1,2,3}, {4,5,6}, {7,8,9} }, { {10,20,30}, {40,50,60}, {70,80,90} } };

        System.out.println(Arrays.deepToString(arr3D));

        // output: { {10,20,30}, {40,50,60}, {70,80,90} }

        System.out.println(Arrays.deepToString(arr3D[1]));

        // output: {40,50,60}

        System.out.println(Arrays.toString(arr3D[1][1]));

        System.out.println(arr3D[0][2][2]);

        System.out.println("-------------------------------");

        for (int[][] eachArr2D : arr3D) {
            for (int[] eachArr1D : eachArr2D) {
                for (int element : eachArr1D) {
                    System.out.println(element);
                }
            }
        }

        System.out.println("--------------------------------");

        int[][][] [] arr4D = {{ { {1,2,3}, {4,5,6}, {7,8,9} }, { {10,20,30}, {40,50,60}, {70,80,90} } }};

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int element : each1D) {
                        System.out.println(element);

                    }
                }
            }
        }


    }


}
