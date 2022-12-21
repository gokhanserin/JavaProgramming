package day22_MultiDimensionalArrays;

import javax.sound.midi.Soundbank;

public class ReverseSentence {

    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";
        String[] words = sentence.split(" ");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";

        }

        System.out.println(reversed);
    }


}
