package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "Java Java";
        String word = "Java";
        int frequency = 0;
        String newword = "";

        for (int i = 0; i <= sentence.length()-4; i++) {
            newword = sentence.substring(i,i+4);
            if (word.equalsIgnoreCase(newword)) {
                frequency += 1;
            }
        }
        System.out.println(frequency);
    }
}

