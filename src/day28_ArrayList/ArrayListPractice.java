package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {  // i index number of list
            list.set(i, list.get(i)*2);
        }
        System.out.println(list);

        System.out.println("------------------------------------");

        ArrayList<String>employee = new ArrayList<>();
        employee.add("Olga");
        employee.add("Hulya");
        employee.add("Ali");
        employee.add("Dimitri");
        employee.add("Alex");
        employee.add("John");
        employee.add("Alien");

        employee.remove(0);
        System.out.println(employee);

        employee.remove(0);
        System.out.println(employee);

        employee.remove(0);
        System.out.println(employee);

        employee.remove(employee.size()-1);
        System.out.println(employee);

        employee.remove("Alex"); // remove only removes the first one if there are multiple of the element.
        System.out.println(employee);

        boolean r1 = employee.remove("Dimitri");
        System.out.println(employee);

        System.out.println("r1 = " + r1);




    }


}
