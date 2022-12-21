package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String str1 = "Cydeo.School@gmail.com";
        //str1 = str1.substring(str1.indexOf("@")+1, str1.lastIndexOf("."));
        //System.out.println(str1);

        int beginningIndex = str1.indexOf("@")+1;
        int endIndex = str1.lastIndexOf(".");
        String domain = str1.substring(beginningIndex,endIndex);
        System.out.println(domain);

        System.out.println("-----------------------------------");

        String str2 = "Java is fun, Java is cool, I love Java";

        String s1 = str2.substring(0,10+1); // Java is fun

        int beg = str2.indexOf(" J")+1;
        int end = str2.lastIndexOf(",");
        String s2 = str2.substring(beg,end);
        String s3= str2.substring(str2.lastIndexOf("I"));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);




    }


}
