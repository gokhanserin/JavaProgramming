package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String sentence = "I Love Java";
        String reversed = "";

        String[] words = sentence.split(" ");
        // words[1] = Love
        for (int i = words[1].length()-1; i >= 0 ; i--) {
            reversed += words[1].charAt(i);
        }
        System.out.println(reversed);
        // sentence = sentence.replaceFirst(words[1],reversed );    1st way
        System.out.println(sentence);

        words[1] = reversed;
        for (String word : words) {
            System.out.print(word + " ");
        }



    }


}
