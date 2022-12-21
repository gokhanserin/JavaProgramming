package day16_ForLoopStringPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabccc";
        String result = "";

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str (starting from 0)
            char ch = str.charAt(i); // ch: each character of str

            if (str.indexOf(ch) == str.lastIndexOf(ch)){ // if the first and last index of the character same then the character is unique.
                result += ch;
            }
        }
        System.out.println(result);

    }


}
