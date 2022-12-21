package utilities;

import java.util.Arrays;

public class ArraysUtility {


    // prints each integer of an integer array in separate lines
    
    public static void printEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }

    // prints each double of a double array in separate lines

    public static void printEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    // prints each char of a char array in separate lines

    public static void printEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    // prints each string of a string array in separate lines

    public static void printEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    // returns the maximum number for integer arrays

    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    // returns the maximum number for double arrays

    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    // returns the minimum number from integer arrays

    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the minimum number from double arrays

    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    // checks if the given integer is contained in the given array, returns boolean ----> contains(int[], int)

    public static boolean contains(int[] numbers, int element){
        boolean result = false;
        for (int each : numbers) {
            if (each==element)
                result=true;
        }
        return result;
    }

    // checks if the given double is contained in the given array, returns boolean ----> contains(int[], int)

    public static boolean contains(double[] numbers, double element){
        boolean result = false;
        for (double each : numbers) {
            if (each==element)
                result=true;
        }
        return result;
    }

    // checks if the given char is contained in the given array, returns boolean ----> contains(int[], int)

    public static boolean contains(char[] numbers, char element){
        boolean result = false;
        for (char each : numbers) {
            if (each==element)
                result=true;
        }
        return result;
    }

    // checks if the given string is contained in the given array, returns boolean ----> contains(int[], int)

    public static boolean contains(String[] numbers, String element){
        boolean result = false;
        for (String each : numbers) {
            if (each.equals(element))
                result=true;
        }
        return result;
    }

    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){

        int[] result = new int[array.length+1];
        int i=0;
        for (int each:array) {
            result[i++] = each;
        }
        result[i]=element;
        //result[array.length-1] = element;
        return result;
    }

    // adds the given element to array, returns a new array

    public static double[] addElement(double[] array, double element){

        double[] result = new double[array.length+1];
        int i=0;
        for (double each:array) {
            result[i++] = each;
        }
        result[i]=element;
        //result[result.length-1] = element;
        return result;
    }

    // adds the given element to array, returns a new array

    public static String[] addElement(String[] array, String element){

        String[] result = new String[array.length+1];
        int i=0;
        for (String each:array) {
            result[i++] = each;
        }
        result[i]=element;
        //result[result.length-1] = element;
        return result;
    }

    // adds the given element to array, returns a new array

    public static char[] addElement(char[] array, char element){

        char[] result = new char[array.length+1];
        int i=0;
        for (char each:array) {
            result[i++] = each;
        }
        result[i]=element;
        //result[result.length-1] = element;
        return result;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if (each==element)
                count++;

        }
        return count;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if (each==element)
                count++;

        }
        return count;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if (each==element)
                count++;

        }
        return count;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if (each.equals(element))
                count++;

        }
        return count;
    }

    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){

        int[] result = {};
        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){

        double[] result = {};
        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){

        char[] result = {};
        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){

        String[] result = {};
        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    // removes the index from the array, returns new array
    //                          {1,2,3,4,3}           4
    public static int[] removeElement(int[] array, int index){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid index:"+index);
            System.exit(0);
        }
        int[] result = new int[array.length-1];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){ //if the index of array is matching with the given index
                continue; //skip
            }

            result[j++]=array[i];
        }
        return result;
    }

    // removes the index from the array, returns new array
    //                          {1,2,3,4,3}           4
    public static double[] removeElement(double[] array, int index){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid index:"+index);
            System.exit(0);
        }
        double[] result = new double[array.length-1];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){ //if the index of array is matching with the given index
                continue; //skip
            }

            result[j++]=array[i];
        }
        return result;
    }

    // removes the index from the array, returns new array
    //                          {1,2,3,4,3}           4
    public static char[] removeElement(char[] array, int index){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid index:"+index);
            System.exit(0);
        }
        char[] result = new char[array.length-1];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){ //if the index of array is matching with the given index
                continue; //skip
            }

            result[j++]=array[i];
        }
        return result;
    }

    // removes the index from the array, returns new array
    //                          {1,2,3,4,3}           4
    public static String[] removeElement(String[] array, int index){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid index:"+index);
            System.exit(0);
        }
        String[] result = new String[array.length-1];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){ //if the index of array is matching with the given index
                continue; //skip
            }

            result[j++]=array[i];
        }
        return result;
    }

    //merge the given two arrays and returns a new array
    public static int[] merge(int[]arr1, int[]arr2){
        int[] result = {};
        for (int each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns a new array
    public static double[] merge(double[]arr1, double[]arr2){
        double[] result = {};
        for (double each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns a new array
    public static char[] merge(char[]arr1, char[]arr2){
        char[] result = {};
        for (char each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns a new array
    public static String[] merge(String[]arr1, String[]arr2){
        String[] result = {};
        for (String each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // reverses the given array, returns a new array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j]=array[i];
        }
        return result;
    }

    // reverses the given array, returns a new array
    public static double[] reverse(double[] array){
        double[] result = new double[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j]=array[i];
        }
        return result;
    }

    // reverses the given array, returns a new array
    public static char[] reverse(char[] array){
        char[] result = new char[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j]=array[i];
        }
        return result;
    }

    // reverses the given array, returns a new array
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j]=array[i];
        }
        return result;
    }


}
