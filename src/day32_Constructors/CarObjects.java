package day32_Constructors;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("BMW", "X6", 2021);
        Car car4 = new Car("Ford", "Fiesta", 2019, 40000);
        Car car5 = new Car("Opel", "Astra", 2017, 50000, "white");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);



    }


}
