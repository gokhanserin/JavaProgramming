package day51_Map;

import java.util.*;

public class IteratingTheMap {

    public static void main(String[] args) {


        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",99);
        students.put("Serkan",70);
        students.put("Andriy",98);

        Set<String> keys = students.keySet();

        for (String eachkey : keys) {
           // System.out.println(eachkey + " : " + students.get(eachkey));

            students.replace(eachkey, students.get(eachkey)+5);

        }
        System.out.println(students);

        Map<String, Integer> earlyBird = new HashMap<>();
        Map<String, Integer> angryBird = new HashMap<>();

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if (value>=90){
                earlyBird.put(key,value);
            }else {
                angryBird.put(key,value);
            }
        }
        System.out.println("earlyBird = " + earlyBird);
        System.out.println("angryBird = " + angryBird);

        Set<String> names = students.keySet();

        System.out.println("---------------------------------------");

        //Collection<Integer> scores = students.values();

        List<Integer> scores = new ArrayList<>(students.values());

        System.out.println("scores = " + scores);

        for (Integer value : students.values()) {
            System.out.println(value);
        }

        System.out.println("----------------------------------------");

        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {
            if (score>maxScore){
                maxScore=score;
            }

            if (score<minScore){
                minScore=score;
            }
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        System.out.println("-----------------------------------");

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        // how many of the students has the score of 95 or higher

        int count = 0;

        for (Integer each : students.values()) {
            if (each>=95){
                count++;
            }
        }

        System.out.println("count = " + count);


        /*for (String eachKey : students.keySet()) {

            Integer eachscore = students.get(eachKey);
            if (eachscore>=95){
                count++;
            }
        }
        System.out.println("count = " + count);
*/

        // setEntry method

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }


}
