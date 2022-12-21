package day37_Inheritance.animalTask;

public class Dog extends Animal {

    public Dog (String name, String breed, char gender, String size, String color, int age) {

        super(name, breed, gender, size, color, age);

    }

    public void bark(){
        System.out.println(name + " is barking");
    }
}
