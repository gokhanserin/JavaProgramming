package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "Gray", 2020, 20000, 123456);
        Tesla tesla = new Tesla("Model s", "Red",2022,94990,0);
        BMW bmw = new BMW("X5", "black", 2020,12000,67350);

        toyota.start();
        tesla.start();
        bmw.start();
        toyota.drive();



    }


}
