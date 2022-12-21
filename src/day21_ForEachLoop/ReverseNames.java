package day21;

public class ReverseNames {

    public static void main(String[] args) {

        String[] names = {"Ahmet Bök", "Hulya Sodur", "Kemal Yurt", "Cengiz Kale", "Tuncer Kaya", "Gizem Yalı"};

        for (String each : names) {
            String reversed = "";

            for (int i = each.length()-1; i >=0 ; i--) {  // to reverse the name
               reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }


    }


}
