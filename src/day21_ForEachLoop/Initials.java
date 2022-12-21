package day21;

public class Initials {

    public static void main(String[] args) {

        String[] names = {"Ahmet Bök", "Hulya Sodur", "Kemal Yurt", "Cengiz Kale", "Tuncer Kaya", "Gizem Yalı"};

        for (String element : names) {
            String initials = element.charAt(0) + "." + element.charAt(element.indexOf(" ")+1);
            System.out.println(initials);
        }


    }


}
