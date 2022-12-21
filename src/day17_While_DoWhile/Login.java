package day17_While_DoWhile;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username:");
        String enteredUsername = input.next();

        System.out.println("Enter your password:");
        String enteredPassword = input.next();

        //String username = "Cydeo";
        //String password = "Cydeo123";

        if (enteredUsername.equals("Cydeo") && enteredPassword.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attempt = 3;
            while (!(enteredUsername.equals("Cydeo") && enteredPassword.equals("Cydeo123")) && attempt>0){
                if (attempt==1){
                    System.out.println("THIS IS LAST CHANCE!");
                }
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                enteredUsername = input.next();

                System.out.println("Enter your password:");
                enteredPassword = input.next();
                attempt--;

            }

            if (enteredUsername.equals("Cydeo") && enteredPassword.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked.");
            }
        }

        input.close();
    }

}
/*
2. You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
username: Cydeo
password: Cydeo123
Ask the user to enter their credentials.
If credentials are matched, your program should print
"Logged in."
If the credentials are not matched, the program should
allow the user to have three attempts to enter correct credentials and if
all three attempts are failed, then print "Your account is locked."
 */