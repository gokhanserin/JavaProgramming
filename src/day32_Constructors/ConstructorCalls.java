package day32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default constructor");
    }
    public ConstructorCalls(int a){
        this(); // default constructor
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(String str){
        this(10); // default constructor and Constructor with int argument
        System.out.println("Constructor with String argument");

    }

    public static void main(String[] args) {
        ConstructorCalls obj1 = new ConstructorCalls();
        System.out.println("----------------------------");
        ConstructorCalls obj2 = new ConstructorCalls(15);
        System.out.println("----------------------------");
        ConstructorCalls onj3 = new ConstructorCalls("name");
    }


}
