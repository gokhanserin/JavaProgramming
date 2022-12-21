package day24_CustomMethods_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        // find the max number between 100 and 200
        int maxnumber = max(100,200);
        System.out.println(maxnumber);

        //find the value of maximum number multiplied by two
        int multipledByTwo = maxnumber*2;
        System.out.println(multipledByTwo);

    }
        public static int max(int a, int b){
            int result = 0;
            if (a>b){
                result = a;
            }else{
                result = b;
            }
            return result;
        }

}
