package day37_Inheritance.animalTask;

public class Parrot extends Animal{

    // public String parrotWingColor;

    public Parrot(String name, String breed, char gender, String size, String color, int age) {
        super(name, breed, gender, size, color, age);

        // this.parrotWingColor=parrotWingColor;
    }

    public void sing(){
        System.out.println(name + " is singing");
    }
}
