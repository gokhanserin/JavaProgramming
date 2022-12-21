package day13_String;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdcharacter = word.charAt(3);
        System.out.println("thirdcharacter = " + thirdcharacter);

        System.out.println("---------------------------------------------");

        String s1 = "Batch 25 is the best batch";
        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length()-1);  // last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println("------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();
        System.out.println(str);

    }


}
