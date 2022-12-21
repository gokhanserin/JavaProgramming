package day36_Inheritance.animal;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Hasky", 'F', "Small", "White", 2);

        dog.eat();
        dog.drink();
        dog.move();
        dog.sleep();
        dog.bark();
        // dog.hunt();
        // dog.roar();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarchin", "Van", 'M', "Small", "Yellow", 3  );

        cat.eat();
        cat.drink();
        cat.move();
        cat.sleep();
        // cat.bark();
        // cat.hunt();
        // cat.roar();
        cat.meow();
        cat.scratch();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Fuzzy", "Bangal", 'M', "Large", "red", 4);

        tiger.eat();
        tiger.drink();
        tiger.move();
        tiger.sleep();
        // tiger.bark();
        tiger.hunt();
        tiger.roar();
        // tiger.meow();
        // tiger.scratch();

        System.out.println(tiger);

    }




}
