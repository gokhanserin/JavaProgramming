package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {


        String first_name = "Gökhan";
        String last_name = "Serin";
        String full_name = first_name + " " + last_name;
        int age = 45;
        String job_title = "SDET";
        String company_name = "Apple Inc";
        double salary = 100000.58;

        // Full name of the person is -----
        System.out.println("Full name of the person is " + full_name);

        // ---- is ---- years old
        System.out.println(full_name + " is " + age+ " years old.");


        // FullName is jobTitle, works at companyName, and fullName' salary is salary
        System.out.println(full_name + " is " + job_title + ", works at " + company_name + ", and "
                + full_name + "'s salary is $" + salary );

    }


}
