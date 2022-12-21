package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Tester tester = new Tester("John",32,'M',1457,"SDET",110000);
        Developer developer = new Developer("Emmy",28,'F',3558,"Developer",120000);
        Teacher teacher = new Teacher("Muhtar",30,'M',6110,"Teacher",100000);
        Student student = new Student("Elizabeth",26,'F',3587,"Physics");

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("------------------------------------");

        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("-----------------------------------");

        developer.work();
        tester.work();
        teacher.work();
        // student.work();

        System.out.println("-----------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();
        developer.fixingBugs();

        System.out.println("-----------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();
        tester.createTicket();

        System.out.println("-----------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();
        // teacher.fixingBugs();
        // teacher.createTicket();

        System.out.println("-----------------------------------");

        student.eat();
        student.drink();
        student.sleep();
        student.study();




    }




}
