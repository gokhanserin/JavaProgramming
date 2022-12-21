package day03_EscapeSequences;

/*
Escape sequences: MUST be given with double quote.
    \n: starts a new line
    \t: paragraph space (tab)
    \\: single back slash
    \": double quote
 */

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java Python C#");
        System.out.println("Java \nPython \nC#");

        System.out.println("------------------------------------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see youu all! \nWhat class do we have next week?");

        System.out.println("------------------------------------------------------");

        System.out.println("   Java is Cool Programming Language");
        System.out.println("\tJava is Cool Programming Language");

        System.out.println("------------------------------------------------------");

        System.out.println("/ \\"); // in order to print one backward slash we need to give two backwards slashes

        System.out.println("------------------------------------------------------");
        System.out.println("My favorite TV show is \"Game of Throne\""); // in order to print double quote we need to
        // give one backward slash and double quote




    }


}
