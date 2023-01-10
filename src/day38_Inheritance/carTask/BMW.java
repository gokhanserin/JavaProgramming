package day38_Inheritance.carTask;

public class BMW extends Car {


    public BMW(String model, String color, int year, double price, int miles) {
        super("BMW", model, color, year, price, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " " + model + " is breaks down" );
    }
    public void racing(){
        System.out.println(brand + " " + model + " is racing");
    }

    public void start() {
        System.out.println("Call mechanic to jump start "+brand+" " +model);
    }
}
/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */
