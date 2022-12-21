package day22_MultiDimensionalArrays;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

        int[][] arr2d = {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        for (int i = arr2d.length - 1; i >= 0; i--) {

            for (int j = 0; j < arr2d[i].length; j++) {

                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------");

        for (int i = 0; i < arr2d.length; i++) {

            for (int j = arr2d[i].length - 1; j >= 0; j--) {

                System.out.print(arr2d[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("-------------------------------");

        for (int i = arr2d.length - 1; i >= 0; i--) {

            for (int j = arr2d[i].length - 1; j >= 0; j--) {

                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }


    }


}

/*
task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9
 task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
 */