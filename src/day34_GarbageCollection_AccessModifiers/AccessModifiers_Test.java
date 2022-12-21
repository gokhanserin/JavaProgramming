package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {

    public static void main(String[] args) {
        System.out.println(AccessModifier.publicData);
        System.out.println(AccessModifier.defaultData);
        // System.out.println(AccessModifier.privateData); // private is not visible outside of the class

        AccessModifier.method1();
        AccessModifier.method2();
       // AccessModifier.method3();
    }


}
