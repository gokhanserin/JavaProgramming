package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

        char ch = 'G';
        String result = "";

        switch (ch){  //This example is a type of logical or (A or B or C or D ==> "passed")
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";
        }

        System.out.println(result);


    }


}
