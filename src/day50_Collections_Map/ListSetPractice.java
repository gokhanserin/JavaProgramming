package day50_Collections_Map;

import day49_Collections.SetPractice2;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set <Integer> set = new HashSet<>();

        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);

        //Integer[] array = set.toArray(new Integer[0]);

        List <Integer> list = new ArrayList<>(set);

        System.out.println(list);

       // List <String> names = null;

        //System.out.println("names.size() = " + names.size());

        System.out.println("--------------------------------");

        // POP --> LIFO

        List <Character> chars = new Stack<>();

        chars.addAll(Arrays.asList('A', 'B', 'C','D'));

        System.out.println("chars = " + chars);

        ((Stack)chars).pop();

        System.out.println("chars = " + chars);

        // PUSH --> Adds element to the end

        ((Stack) chars).push('Z');

        System.out.println("chars = " + chars);

        // PEEK --> Returns the element at the top of stack

        System.out.println(((Stack<Character>) chars).peek());


        // poll -- > FIFO

        List <String> names = new LinkedList<>();
        names.addAll(Arrays.asList("Noris", "Martin","Ricky","John", "Bart", "Kelly"));
        System.out.println(names);

        ((LinkedList)names).poll();  // comes from the Queue by inheritance

        System.out.println(names);

        ((LinkedList<String>) names).push("Amelia");

        System.out.println("names = " + names);

        System.out.println(((LinkedList<String>) names).peek());

    }


}
