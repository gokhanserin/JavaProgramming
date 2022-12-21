package day16_ForLoopStringPractices;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Wooden spoon";

        String result = ""; // contains the reversed version of str

        for (int i = str.length()-1; i >= 0 ; i--) { // index number of str (starting last index to index 0
            result += str.charAt(i); // adding each character to result
        }
        System.out.println(result);

    }


}
