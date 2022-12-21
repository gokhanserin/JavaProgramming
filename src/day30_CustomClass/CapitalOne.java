package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("John", 2145, 'M', 36, "worker", 30000, false);

        Employee employee2 = new Employee();
        employee2.setInfo("Celina", 1487, 'F', 40, "manager", 50000, true);

        Employee employee3 = new Employee();
        employee3.setInfo("Dougles", 1933, 'M', 28, "SDET", 60000, true);

        Employee employee4 = new Employee();
        employee4.setInfo("Elizabeth", 8961, 'F', 50, "CEO", 70000,true);

        Employee employee5 = new Employee();
        employee5.setInfo("Steven", 5513, 'M', 30, "PO", 65000, true);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};

        int countfullTime = 0;
        int countpartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {
            if (employee.isFullTime){
                countfullTime++;
            }else{
                countpartTime++;
            }

            if (employee.salary > max){
                max = employee.salary;
            }

            if (employee.salary < min){
                min = employee.salary;
            }
        }


        System.out.println(countfullTime);
        System.out.println(countpartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }


}
