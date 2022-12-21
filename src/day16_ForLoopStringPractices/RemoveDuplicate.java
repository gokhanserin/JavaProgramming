package day16_ForLoopStringPractices;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String str = "aabbaacc";
        String result = ""; // I want abc

        for (int i = 0; i <= str.length()-1; i++) { // i represents all the index numbers of str (starts from 0)
            String ch = ""+str.charAt(i); // represents each character of str

            if (!result.contains(ch)) // if the character is not contained in the result

            result += ch; // the character will be added to the result

        }
        System.out.println(result);
    }

}
/*
Write a program that can remove the duplicated characters from the string
 */