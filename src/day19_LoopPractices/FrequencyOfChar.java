package day19_LoopPractices;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";  // a2b1c3d1

        for (int j = 0; j < str.length(); j++) {
            int counter = 0;
            char ch = str.charAt(j); // each character from string

            for (int i = 0; i < str.length() ; i++) {  // to find the frequency of each character
                char each = str.charAt(i); // each character of str
                if (ch==each){
                    counter++;
                }
            }
            if (result.contains(""+ch)){
                continue;
            }
            result+= ch;
            result+= counter;
        }


        System.out.println(result);
    }
}
/*
1. Write a program that can find the frequency of the characters from a string
			 Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
 */