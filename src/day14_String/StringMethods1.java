package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

    String str1 = "       batch    25        ";
    str1 = str1.trim();
        System.out.println(str1);

        String str2 = "Cydeo school";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3 = "Java programming language";
        int n3 = str3.indexOf("a ");
        System.out.println("n3 = " + n3);

        int n4 = str3.lastIndexOf("g");
        System.out.println("n4 = " + n4);

        String s = "Java Nova Cava Wawa Orange";
        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        //int fourthA = s.indexOf("ava W");
        //int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") + 1;
        int fifthA = s.lastIndexOf("a W");
        //int fifthA = s.lastIndexOf("va") + 1;
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.indexOf("a O");
        //int seventhA = s.lastIndexOf("wa") + 1;

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);


    }
}
