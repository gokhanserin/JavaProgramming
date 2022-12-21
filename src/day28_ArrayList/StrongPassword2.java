package day28_ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {

        String password = "WoodenSpoon123";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigit = 0;
        int countSpecialCharacter = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);
            if (Character.isUpperCase(each)){
                countUpperCase++;
            }else if (Character.isLowerCase(each)){
                countLowerCase++;
            }else if (Character.isDigit(each)){
                countDigit++;
            }else{
                countSpecialCharacter++;
            }

        }
        boolean isUpperCase = countUpperCase>0;
        boolean isLowerCase = countLowerCase>0;
        boolean isDigit = countDigit>0;
        boolean isSpecialCharacter = countSpecialCharacter>0;

        boolean isStrongPassword = password.length()>=8 && !password.contains(" ") && isUpperCase && isLowerCase && isDigit && isSpecialCharacter;

        System.out.println("isStrongPassword = " + isStrongPassword);



    }


}
