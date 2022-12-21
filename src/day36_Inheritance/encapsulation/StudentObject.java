package day36_Inheritance.encapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("John", 29, 'G', 'D', "Harvard");
        student1.setAge(32);
        student1.setGender('M');
        System.out.println(student1);


    }


}
