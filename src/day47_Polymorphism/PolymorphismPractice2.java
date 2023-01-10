package day47_Polymorphism;
import day43_Abstraction.employeeTask.Employee;
import day43_Abstraction.employeeTask.Developer;
import day43_Abstraction.employeeTask.Tester;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismPractice2 {

    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        };

        List<Employee> scrumMembers = new ArrayList<>();

        for (Employee eachEmployee : employees) {
            if (eachEmployee instanceof Tester || eachEmployee instanceof Developer){
                scrumMembers.add(eachEmployee);
            }
        }

        List<Tester> testers = new ArrayList<>();

        for (Employee eachScrumMember : scrumMembers) {
            if (eachScrumMember instanceof Tester){
                testers.add((Tester)eachScrumMember);
            }
        }

        List<Developer> developers = new ArrayList<>();

        for (Employee eachscrumMember : scrumMembers) {
            if (eachscrumMember instanceof Developer){
                developers.add((Developer)eachscrumMember);
            }
        }

        Employee employeeWithMaxSalary = scrumMembers.get(0);
        Employee employeeWithMinSalary = scrumMembers.get(0);

        for (Employee eachscrumMember : scrumMembers) {
            if (eachscrumMember.getSalary()>employeeWithMaxSalary.getSalary()){
                employeeWithMaxSalary=eachscrumMember;
            }
            if (eachscrumMember.getSalary()<employeeWithMinSalary.getSalary()){
                employeeWithMinSalary=eachscrumMember;
            }
        }

        Tester testerWithMaxSalary = testers.get(0);
        for (Tester eachtester : testers) {
            if (eachtester.getSalary() > testerWithMaxSalary.getSalary()){
                testerWithMaxSalary = eachtester;
            }
        }

        Developer developerWithMaxSalary = developers.get(0);
        for (Developer eachdeveloper : developers) {
            if (eachdeveloper.getSalary() > developerWithMaxSalary.getSalary()){
                developerWithMaxSalary = eachdeveloper;
            }
        }

        System.out.println("developers = " + developers);
        System.out.println("testers = " + testers);
        System.out.println("employeeWithMinSalary = " + employeeWithMinSalary);
        System.out.println("employeeWithMaxSalary = " + employeeWithMaxSalary);
        System.out.println("testerWithMaxSalary = " + testerWithMaxSalary);
        System.out.println("developerWithMaxSalary = " + developerWithMaxSalary);


    }






}
/*
2. Given the following array that contains Employee objects:
			Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        	};
    		(import them from day43 package)
	   	2.1 store all the developers & testers into the following List of employees
        		List<Employee> scrumMembers = new ArrayList<>();
        2.2 store all the testers into the following List of testers:
        		List<Tester> testers = new ArrayList<>();
        2.3 store all the developers into the following List of developers:
        		List<Developer> developers = new ArrayList<>();
        2.4 which tester has the maximum salary?
        2.5 which developer has the maximum salary?
 */
