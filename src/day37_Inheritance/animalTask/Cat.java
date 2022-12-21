package day37_Inheritance.animalTask;

public class Cat extends Animal {


    public Cat(String name, String breed, char gender, String size, String color, int age) {
        super(name, breed, gender, size, color, age);
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }
}
