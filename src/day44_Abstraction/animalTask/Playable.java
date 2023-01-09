package day44_Abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true; // static + final by default

    /*
    public static void method1(){  // static methods use only static members!!!
        System.out.println(isFriendly);
    }
    */

    void play(); // abstract by default




}
