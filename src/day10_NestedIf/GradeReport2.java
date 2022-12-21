package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {
    /*
        int score = 65;
        String result = "";  // temporary

        if (score>=0 && score<=100){  // if score is valid  (0--100)
            if (score>=90){  // false: score < 90
                result = "Excellent";
            }else if (score >= 80){  // false: score < 80
                result = "Great";
            }else if (score >= 70){  // false: score < 70
                result = "Good";
            }else if (score >= 60){  // false: score < 60
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else{  // The score is not valid
            result = "Invalid score";
        }
        System.out.println(result);
        */

        int score = 70;
        String result = (score>=0 && score<=100)? (score>=90)? "Excellent" :(score >= 80)? "Great" :(score >= 70)? "Good"
        :(score >= 60)? "Passed" :"Failed" : "Invalid score";
        System.out.println(result);

        System.out.println("-----------------------------------------");

        // solution 3: Mixed method

        String result2 = "";

        if(score>=0 && score<=100) {
            result2 = (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good"
                    : (score >= 60) ? "Passed" : "Failed";
        }else{
            result2 = "Invalid score";
        }
        System.out.println(result2);
    }


}
