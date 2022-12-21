package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        // check if a given number is odd or even
        oddOrEven(10);
        System.out.println("---------------------------");
        ageOfPerson(1995);
        System.out.println("--------------------------");
        printNumbers(10,50);


    }
    public static void oddOrEven(int number){
        if (number %2 == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }
    }

    // create a function that can display the age of a person
    public static void ageOfPerson(int birthYear){
        int age = 2021 - birthYear;
        System.out.println("Your age is: " + age);
    }
    //create a function that can print the numbers between x and y
    public static void printNumbers(int x, int y){
        for (int i = x; i <=y ; i++) {
            System.out.println(i);
        }

    }


}
