package day17_While_DoWhile;

import java.util.Scanner;

public class LoginWithBreak {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = input.next();

        System.out.println("Enter your password:");
        String password = input.next();


        for (int i = 1; i <=3 ; i++) {
            if ( username.equals("Cydeo") && password.equals("Cydeo123") ){
                System.out.println("Logged in");
                break;
            }else{
                System.out.println("Enter your username:");
                username = input.next();

                System.out.println("Enter your password:");
                password = input.next();

            }
            if (i==3){
                System.out.println("Your account is locked");
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
for(int i = 1; i <= 3; i++){
if(valid){
sout("Loged In")
break;
}
if( i==3){
sout(Your account is locked)
}
}
 */