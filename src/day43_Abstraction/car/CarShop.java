package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

        //Car car1 = new Car("Cydeo","25","blue",2021,100000);
        // we can not create object from abstract class, because abstract class is not concrete

        Honda honda = new Honda("Civic","red",2021,45000);
        Audi audi = new Audi("Q7", "blue", 2020,40000);
        Tesla tesla = new Tesla("Model3","white",2022,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("-------------------------");

        honda.setColor("pink");
        audi.setColor("red");
        tesla.setColor("black");

        honda.setPrice(42500);
        audi.setPrice(47800);
        tesla.setPrice(52140);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


    }



}
