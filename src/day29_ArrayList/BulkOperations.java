package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,9,10,3,3,3,3,3,5,5,5,5,8,8,8,8));
        System.out.println("list = " + list);


        list.removeAll(Arrays.asList(3,5,8));
        System.out.println("list = " + list);

        System.out.println("-------------------------------------");

        ArrayList<Integer>numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,700,800));
        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);

        System.out.println("-----------------------------------");

        ArrayList<String>jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QE", "SDET", "developer", "QE", "SDET", "Scrum master", "PO"));
        jobTitles.retainAll(Arrays.asList("QE", "SDET"));
        System.out.println(jobTitles);

        System.out.println("---------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));
        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);
        boolean r3 = nums.containsAll(Arrays.asList(2,5,10));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("----------------------------------");

        String[] names = {"John", "Albert", "Helen", "Doroti", "Melissa", "Clain"};

        ArrayList<String>nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);

        /*
        ArrayList<String>nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
        System.out.println(nameList);
*/

        System.out.println("--------------------------------------");

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10,}; // if we use int [] we get compiler error because ArrayList does not work with int.
        ArrayList<Integer>list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);

        System.out.println("------------------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("list3 = " + list3);



    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer each : array) {
            list.add(each);
        }
        return list;
    }


}
