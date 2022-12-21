package day21;

public class MaximumNumber {

    public static void main(String[] args) {

        int[] numbers = {5,10,4,20,1,0};
        int max = numbers[0];

        for (int number : numbers) {
            if (number>max)
                max=number;
        }
        System.out.println(max);

    }


}
