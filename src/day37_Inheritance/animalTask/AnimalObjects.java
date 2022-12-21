package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'F', "Small", "white", 1);

        System.out.println(dog1);

        dog1.bark();
        // dog1.scratch();
        // dog1.sing();

        Cat cat1 = new Cat("Pıtır", "Moly", 'M', "medium", "gray", 2);

        System.out.println(cat1);

        // cat1.bark();
        cat1.scratch();
        // cat1.sing();

        Parrot parrot1 = new Parrot("Papu", "Maow", 'F', "large", "yellow", 3);

        System.out.println(parrot1);

        // parrot1.bark();
        // parrot1.scratch();
        parrot1.sing();


    }


}
