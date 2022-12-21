package day19_LoopPractices;

public class T1_firstDuplicated {

    public static void main(String[] args) {

        String str = "dvaaceeegbb";
        String result = "";  // aaeeebb ---> a

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length() ; i++) {
                char each = str.charAt(i);
                if (ch==each){
                    count ++;
                }
        }
            /*if (result.contains(""+ch))  // you can use this to remove the repetation of chars.
                continue;*/
            if (count>1)
                result += ch;
        }
        System.out.println(result.charAt(0));
    }

}
/*
1. Write a program that can return the first duplicated character from a string
 */
