package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";
        int frequency = 0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java","");
            frequency ++;
        }
        System.out.println(frequency);

        System.out.println("-------------------------------------");

        String sentence = "cat cat cat cat dog dog dog cat cat CAT CAt cAt";
        int countCat = 0;
        sentence = sentence.toLowerCase();

        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat","");
            countCat++;
        }
        System.out.println(countCat);

        System.out.println("----------------------------");

        String s = "Java Java Java Python Python Python";
        int countJava = 0;
        int countPython = 0;

        while ( s.contains("Java") || s.contains("Python") ) {
            if (s.contains("Java")) {
                s = s.replaceFirst("Java", "");
                countJava++;
            } else {
                s = s.replaceFirst("Python", "");
                countPython++;
            }

        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);
    }
}

