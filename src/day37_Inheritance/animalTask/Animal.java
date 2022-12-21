package day37_Inheritance.animalTask;

public class Animal {

    public String name, breed;
    public char gender;
    public String size;
    public String color;
    public int age;

    public Animal (String name, String breed, char gender, String size, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public void  move(){
        System.out.println(name+ " is moving");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
