package day38_Inheritance.carTask;

public class Car {

    public String brand, model, color;
    public int year;
    public double price;
    public int miles;

    public Car(String brand, String model, String color, int year, double price, int miles) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.miles = miles;
    }

    public void start(){
        System.out.println(brand + " " + model + " is starting");
    }
    public void drive(){
        System.out.println(brand + " " + model + " is driving");
    }

    /*
    public void fly(){
    }
    fly() is not common for all the cars, and parent class should only contain the common feature of all the subclasses
    */

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}
/*
Create a class called Car
			instance variables:
				brand, model, year, price, color, miles
				add a constructor to set all the fields
			instance methods:
				start(), drive(),toString()
 */
