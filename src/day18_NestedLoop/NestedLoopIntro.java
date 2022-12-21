package day18_NestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        System.out.println("---------------------------------");

        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");
            }
        }

    }


}
