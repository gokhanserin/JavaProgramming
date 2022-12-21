package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");
        Student student2 = new Student("Hulya", 'F');
        Student student3 = new Student("John", 1452);
        Student student4 = new Student("Jessica", 4561, 'A');
        Student student5 = new Student("Olga", 'F', 41);
        Student student6 = new Student("Smith", 'M', 36,2447);
        Student student7 = new Student("Adam", 'M', 25, 3256, 'B');

        System.out.println(student1==student2);
        Student [] students = {student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));

    }


}
