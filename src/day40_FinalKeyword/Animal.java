package day40_FinalKeyword;

public class Animal {

    private String name;
    private final String breed;
    private final String color;
    private final char gender;
    private String size;
    private int age;

    public Animal(String name, String breed, String color, char gender, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.size = size;
        this.age = age;
    }

    //---------------------Getters------------------------------

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    //---------------------Setters-----------------------------


    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //---------------------Setters-----------------------------

    public void eat(){
        System.out.println(name + " is eating");
    }
    public final void drink(){
        System.out.println(name + " is drinking water");
    }
}
