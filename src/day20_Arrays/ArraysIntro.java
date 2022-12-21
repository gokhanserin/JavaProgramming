package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create a variable that is capable enough to contain five names.
        String[] myGroup = new String[5]; // indices 0--4
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Mikael";
        myGroup[4] = "Hulya";
        // myGroup [5] = "Muhtar";
        // System.out.println(myGroup); // hashcode
        System.out.println(Arrays.toString(myGroup));

        System.out.println("--------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));

        int number = 5;
        if (number < 1 || number > 7) {
            System.out.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number]);

        System.out.println("------------------------------");

        int number1 = 4;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December"};

        System.out.println(Arrays.toString(months));
        System.out.println(months[number1]);
        System.out.println(months[4]);

        System.out.println("----------------------------------------");

        String[] months1 = new String[12];
        months1 [0] = "January";
        months1 [1] = "February";
        months1 [2] = "March";
        months1 [3] = "April";
        months1 [4] = "May";
        months1 [5] = "June";
        months1 [6] = "July";
        months1 [7] = "August";
        months1 [8] = "September";
        months1 [9] = "October";
        months1 [10] = "November";
        months1 [11] = "December";

        System.out.println(Arrays.toString(months1));
        System.out.println(months1[6]);


    }

}
