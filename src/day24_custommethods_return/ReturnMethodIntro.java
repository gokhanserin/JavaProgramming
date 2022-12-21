package day24_CustomMethods_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        String str = "Java";
        String result = reverse(str);
        System.out.println(result);

        if (str.equalsIgnoreCase(reverse(str))){
            System.out.println(str + " is palindrom");
        }else{
            System.out.println(str + " is not a palindrom");
        }



    }
    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }


}
