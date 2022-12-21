package day15_ForLoop;

import java.util.Scanner;

public class ReplaceAllX {

    public static void main(String[] args) {

        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next();
        word = word.replace("x","a").replace("X","a");

        System.out.println(word);


    }


}
/*
2. Write a program that asks user to enter a word. and replace all
the x or X with character a
Input:
xcodeX
Output:
acodea
 */