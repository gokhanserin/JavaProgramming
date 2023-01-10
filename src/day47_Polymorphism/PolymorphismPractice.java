package day47_Polymorphism;
import day38_Inheritance.carTask.BMW;
import day38_Inheritance.carTask.Toyota;
import day38_Inheritance.carTask.Car;
import day38_Inheritance.carTask.Tesla;

import java.util.ArrayList;
import java.util.List;


public class PolymorphismPractice {

    public static void main(String[] args) {

        Car[] cars = {
                new Toyota("Highlander", "White", 2010, 25000, 255000),
                new BMW("X5", "Red", 2014, 32000, 12000),
                new Toyota("Corolla", "White", 2011, 20000, 310000),
                new BMW("M3", "Blue", 2015, 33000, 14030),
                new BMW("M5", "Black", 2017, 35000, 15000),
                new BMW("M4", "White", 2018, 40000, 19000),
                new BMW("7 Series", "Purple", 2009, 30000, 21000),
                new BMW("i3", "Black", 2011, 30000, 9000),
                new Toyota("Camry", "Red", 2018, 30000, 185000),
                new Toyota("Rav4", "Red", 2012, 23000, 285000),
                new Toyota("Avalon", "Blue", 2019, 35000, 175230),
                new Tesla("Model 3", "White", 2015, 45000, 235000),
                new Tesla("Model Y", "Black", 2017, 65000, 135000),
                new Tesla("Model X", "White", 2016, 48000, 235000),
                new Tesla("Model X", "White", 2014, 48000, 236000),
        };



        for (Car eachcar: cars) {
            if (eachcar instanceof Toyota){
                if (eachcar.year==2011 || eachcar.year == 2010 ){
                    System.out.println(eachcar);
                }
            }
            if (eachcar instanceof BMW){
                System.out.println(eachcar);
            }
            if (eachcar instanceof Tesla){
                if (eachcar.year >=2015 && eachcar.year<=2016){
                    System.out.println(eachcar);
                }
            }

        }

        System.out.println("------------------------------------");

        Car carWithHighestMileage = cars[0];
        Car carWithLowestMileage = cars[0];

        for (Car eachcar: cars) {

            if (eachcar.miles > carWithHighestMileage.miles){
                carWithHighestMileage = eachcar;
            }
            if (eachcar.miles < carWithLowestMileage.miles){
                carWithLowestMileage = eachcar;
            }
        }
        System.out.println("carWithLowestMileage = " + carWithLowestMileage);
        System.out.println("carWithHighestMileage = " + carWithHighestMileage);
    }


}
/*
1 Given the following array that contains the car objects:
				Car[] cars = {
		                new Toyota("Highlander", 2010, 25000, "White", 255000),
		                new BMW("X5", 2014, 32000, "Red", 12000),
		                new Toyota("Corolla", 2011, 20000, "White", 310000),
		                new BMW("M3", 2015, 33000, "Blue", 14030),
		                new BMW("M5", 2017, 35000, "Black", 15000),
		                new BMW("M4", 2018, 40000, "White", 19000),
		                new BMW("7 Series", 2009, 30000, "Purple", 21000),
		                new BMW("i3", 2011, 30000, "Black", 9000),
		                new Toyota("Camry", 2018, 30000, "Red", 185000),
		                new Toyota("Rav4", 2012, 23000, "Red", 285000),
		                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
		                new Tesla("Model 3", 2015, 45000, "White", 235000),
		                new Tesla("Model Y", 2017, 65000, "Black", 135000),
		                new Tesla("Model X", 2016, 48000, "White", 235000),
		                new Tesla("Model X", 2014, 48000, "White", 236000),
		        };
		        (import them from day38 package)
	        1.1 Write a program that can display all the cars that are eligible for recall
	        					Cars that are eligible for recall:
	        							Toyota: from year 2010 to 2011
	        							BMW: from year 1929 to 2022
	        							Tesla: from year 2015-2016
			1.2 Write a program that can display the car that has the highest mileage
			1.3 Write a program that can display the car that has the lowest mileage
 */
