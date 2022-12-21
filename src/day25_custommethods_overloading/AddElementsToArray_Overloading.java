package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {


        int[] arr = {7,8,9,10};
        arr=addElement(arr,11);
        System.out.println(Arrays.toString(arr));

        String[] names = {"John", "Melissa", "Caterina", "Jack"};  // "Sabrina"
        names = addElement(names, "Sabrina");
        System.out.println(Arrays.toString(names));

        char[] letters = {'K', 'L', 'M', 'N', 'R', 'F'};  // 'S'
        letters = addElement(letters,'S');
        System.out.println(Arrays.toString(letters));

    }

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

}
