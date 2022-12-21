package day36_Inheritance.lunchTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("John","SDET","Amazon",'M',32,2547,110000);
        tester.smokeTesting();
        tester.regressionTesting();

        System.out.println(tester);

        Developer developer = new Developer();
        developer.setInfo("Melissa","developer","Apple", 'F',28,1457,130000);
        developer.code();

        System.out.println(developer);

        Driver driver = new Driver();
        driver.setInfo("Kelvin","driver","Sony", 'M', 38,3698,50000);
        driver.drive();

        System.out.println(driver);

        Teacher teacher = new Teacher();
        teacher.setInfo("Kathy", "Teacher", "IBM", 'F', 35, 2117, 65000);
        teacher.teach();
        System.out.println(teacher);


    }


}
