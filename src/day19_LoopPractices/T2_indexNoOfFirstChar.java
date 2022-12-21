package day19_LoopPractices;

public class T2_indexNoOfFirstChar {

    public static void main(String[] args) {

        String str = "dwqeetyooopzcc";
        String result = "";


        for (int j = 0; j < str.length() ; j++) {

            char ch = str.charAt(j);

                   if (result.contains(""+ch)){
                    break;
                }
                result+=ch;
        }

        System.out.println(result);
        System.out.println(result.indexOf(result.charAt(result.length()-1)));
        System.out.println(result.charAt(result.length()-1));

    }

}
/*
2. Write a program that cna return the index number of the first duplicated character from a string
 */
