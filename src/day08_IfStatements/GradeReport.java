package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

    int score = 85;  // 0--100;

        boolean a = score>=90 && score <= 100;
        boolean b = score >= 80 && score<=89;
        // boolean b = score >= 80 && !a;  // if score is not A, but is greater than 79

        // boolean c = score >= 70 && score <= 79;
        boolean c = !a && !b && score >= 70;

        boolean d = score>= 60 && score <= 69;

        boolean f = score >= 0 && score <=59;
        //  boolean f = !a && !b && !c && !d;

        if (a) {  // if the student made an A
        System.out.println("Excellent");
        }
        if (b) { // if the students made a B
            System.out.println("Great");
        }
        if (c) {
            System.out.println("Good");
        }
        if (d) {
            System.out.println("Passed");
        }
        if (f) {
            System.out.println("Failed");
        }
/*
    90-100 ===> Excellent
    80-89 ===> Great
    70-79 ===> Good
    60-69 ===> Passed
    0-59 ===> Failed

 */


    }


}
