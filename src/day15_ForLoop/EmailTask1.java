package day15_ForLoop;

public class EmailTask1 {

    public static void main(String[] args) {

        String firsName = "mike";
        String lastName = "tyson";
        String email  = firsName + "_" + lastName + "@gmail.com";
        System.out.println(email);
        System.out.println(firsName.charAt(firsName.length()));
        if (firsName.charAt(firsName.length())=='_'){
            System.out.println(lastName + "_" + firsName + "@gmail.com");
        }else{
            System.out.println(email);
        }


    }

}
/*
8. Create a class calledEmailTask1.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that can swap first name with last name in the
email (Seperated by an underscore).
If the email doesn't contain an underscore print the given input
email.
Ex:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
 */