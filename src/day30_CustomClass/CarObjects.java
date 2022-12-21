package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("Toyota", "Camry", 2021, "White", 35000);

        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("BMW", "335is", 2020, "Black", 45000);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", 2020, "Red", 40000);
        System.out.println(car3);

        ArrayList<Car> carslist = new ArrayList<>();
        carslist.addAll(Arrays.asList(car1,car2,car3));
        for (Car each : carslist) {
            System.out.println(each.brand + ":" + each.price );
        }

        System.out.println("---------------------------------------");

        // Recall:
        //BMW: 2005-2008
        // Toyota: 1995-1997

        carslist.removeIf(p-> p.brand.equals("BMW") && p.year>=2005 && p.year<=2008);
        carslist.removeIf(p-> p.brand.equals("Toyota") && p.year>=1995 && p.year<=1997);



    }


}
