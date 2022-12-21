package day21;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "adbc";
        String str2 = "dbac";

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        boolean r = Arrays.equals(char1,char2);
        System.out.println(r);
        System.out.println("---------------------------------------");

        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------");

        String email = "WoodwnSpoon@cydeo.com";
        String[] str = email.split("@");
        System.out.println(Arrays.toString(str));

        System.out.println("------------------------------------");

        String s = "Today is nice day. Today is Monday. Today we learn Java.";
        String[] sentences = s.split("\\. ");
        System.out.println(Arrays.toString(sentences));

    }


}
