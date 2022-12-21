package day21;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Java";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        for( char each : chars ){
            System.out.println(each);
        }




    }


}
