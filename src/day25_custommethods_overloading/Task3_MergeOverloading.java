package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class Task3_MergeOverloading {

    public static void main(String[] args) {
/*
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};

        int[] result = mergeTwoIntegerArrays(arr1,arr2);
        System.out.println(Arrays.toString(result));

        System.out.println("---------------------------");

        double[] arr3 = {1.5,2.5,3.5};
        double[] arr4 = {4.5,5.5};

        double[] result1 = mergeTwoDoubleArrays(arr3,arr4);
        System.out.println(Arrays.toString(result1));

        System.out.println("---------------------------");

        char[] arr5 = {'A', 'B', 'C',};
        char[] arr6 = {'D', 'E'};
        char[] result2= mergeTwoCharArrays(arr5,arr6);
        System.out.println(Arrays.toString(result2));

        System.out.println("---------------------------");

        String[] arr7= {"book", "pen", "eraser"};
        String[] arr8= {"table", "chair"};
        String[] result3 = mergeTwoStringArrays(arr7,arr8);
        System.out.println(Arrays.toString(result3));
*/

        int[] numbers1 = {10,20,30,40};
        int[] numbers2 = {50,60,70};
        int[] result = mergeTwoArrays(numbers1,numbers2);
        System.out.println(Arrays.toString(result));

    }

    public static int[] mergeTwoArrays(int[] array1, int[] array2){  // {1,2,3} and {4,5}

        int[] newArray = new int[array1.length + array2.length];
        int i=0;
        for (int each : array1) {
            newArray[i++]=each;
        }
        for (int each : array2) {
            newArray[i++]=each;
        }
        return newArray;
    }

    public static double[] mergeTwoArrays(double[] array1, double[] array2){  // {1,2,3} and {4,5}

        double[] newArray = new double[array1.length + array2.length];
        int i=0;
        for (double each : array1) {
            newArray[i++]=each;
        }
        for (double each : array2) {
            newArray[i++]=each;
        }
        return newArray;
    }

    public static char[] mergeTwoArrays(char[] array1, char[] array2){  // {1,2,3} and {4,5}

        char[] newArray = new char[array1.length + array2.length];
        int i=0;
        for (char each : array1) {
            newArray[i++]=each;
        }
        for (char each : array2) {
            newArray[i++]=each;
        }
        return newArray;
    }

    public static String[] mergeTwoArrays(String[] array1, String[] array2){  // {1,2,3} and {4,5}

        String[] newArray = new String[array1.length + array2.length];
        int i=0;
        for (String each : array1) {
            newArray[i++]=each;
        }
        for (String each : array2) {
            newArray[i++]=each;
        }
        return newArray;
    }

}
/*
Task 3

1. Create a method that can merge two integer arrays.
2. Create a method that can merge two double arrays.
3. Create a method that can merge two char arrays.
4. Create a method that can merge two string arrays.

 */