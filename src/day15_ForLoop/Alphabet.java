package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

        // A--Z

        for (int i=65; i<=90; i++){
            System.out.print((char)i + " ");
        /*for (char i = 'A'; i<='Z'; i++) {
            System.out.print(i + " ");*/
        }
        System.out.println();

        // a-z

        for (char i='a'; i<='z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        // Z-A

        for (char i='Z'; i>='A'; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        // z--a

        for (char i='z'; i>='a'; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------------------");

        for (char i='1'; i<=40000; i++){
            System.out.print(i+" ");
            char x = 'Ә';
        }


    }


}
