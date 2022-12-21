package day16_ForLoopStringPractices;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345Sc hool!#$£%WoodenSpoon";

        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length() ; i++) { // i: index numbers of str
            char ch = str.charAt(i); // ch: each character that we have in str

            if (ch >= '0' && ch <= '9'){ // if the character is between '0' and '9' then it is digit
                digits += ch;

            }else if (ch >= 'A' && ch <= 'Z'){ // if the character is between 'A' and 'Z' then it is letter
                letters += ch;
            }else if (ch >= 'a' && ch <= 'z'){ // if the character is between 'a' and 'z' then it is letter
                letters += ch;
            }else {
                if (ch != ' ') {
                    specialChars += ch;
                }
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }


}
