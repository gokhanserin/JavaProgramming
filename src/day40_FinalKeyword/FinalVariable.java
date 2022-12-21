package day40_FinalKeyword;

public class FinalVariable {

    final String birthDate;
    final static String name;
    static {
        name = "Batch25";
    }

    public FinalVariable(String birthDate) {
        this.birthDate = birthDate;
    }

    public static void main(String[] args) {

        final double pi = 3.14;

        // pi=4.14; // final variables can not be reassigned
        // pi=5.4;

        final String name;
        name="Java";
        // name = "WoodenSpoon";

        System.out.println(name);

        System.out.println("----------------------------------------");

        FinalVariable obj = new FinalVariable("March/10");
        // obj.birthDate = "June/01"; // final variables can not be assigned
        System.out.println(obj.birthDate);

        System.out.println("----------------------------------------");

        // FinalVariable.name = "Python";
        System.out.println(FinalVariable.name);

    }





}
