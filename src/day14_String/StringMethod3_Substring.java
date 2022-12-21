package day14_String;

public class StringMethod3_Substring {

    public static void main(String[] args) {

        // substring (beginning index, ending index)

        String word = "Cydeo school";
        String brand = word.substring(0,4+1); // ending index ignore the last index so add 1 to ending index of the last char.
        System.out.println(brand);

        String str1 = word.substring(6); // no need to give the ending index if the word id the final word.
        System.out.println(str1);

        System.out.println("-------------------------------------");

        String word2 = "Java programming language";

        //String s1 = word2.substring(0,word2.indexOf(" "));
        //String s2 = word2.substring(word2.indexOf("p"), word2.indexOf(" l"));
        //String s3 = word2.substring(word2.indexOf("l"));

        String s1 = word2.substring(0,word2.indexOf(" "));
        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
        String s3 = word2.substring(word2.lastIndexOf(" ")+1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }


}
