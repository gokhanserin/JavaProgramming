package day17_While_DoWhile;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "AAABBBC";
        int frequency = 0;
        char ch = 'D';
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i)==ch){
                frequency ++;
            }
        }
        System.out.println(frequency);

    }


}
