package day08_IfStatements;

public class LogicalOperations {

    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";
        //                  19 >= 18    &&  UK == USA
        //                  true        &&      false
        //                              false

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("------------------------------------------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        boolean isEligible2 = creditScore >=700 && age2 >= 21;
        System.out.println(name2 + " is eligible to loan: " + isEligible2);

        System.out.println("------------------------------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age >= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name3 + " is eligible to register: " + isEligible3);

        System.out.println("------------------------------------------------");

        String name4 = "James";
        String countryofBirth = "UK";
        boolean marriedtoUScitizen = false;
         boolean isEligible4 = countryofBirth == "USA" || marriedtoUScitizen == true;

        System.out.println(name4 + " is eligible to apply for US citizenship: " + isEligible4);

        System.out.println("------------------------------------------------");

        String student = "Anna";
        double gpa = 2.5;
        int familyIncome = 400000;
        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student + " is eligible for scholarship: " + isEligible5);

        System.out.println("------------------------------------------------");

        boolean result2 = true;
        boolean result3 = !result2;
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        System.out.println("------------------------------------------------");

        int score = 85;
        boolean passed = score>= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);





    }


}
