package day15_ForLoop;

public class ReverseString {

    public static void main(String[] args) {

        String word = "water";
        int length = word.length();

        for (int i = length-1; i >= 0 ; i--) {
            System.out.print(word.charAt(i));
        }



    }


}
