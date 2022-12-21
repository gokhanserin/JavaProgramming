package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifier;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {
        System.out.println(AccessModifier.publicData);
       // System.out.println(AccessModifier.defaultData); // default access modifier is not visible outside the original package
       // System.out.println(AccessModifier.privateData); // private access modifier is not visible outside the original package and class


        AccessModifier.method1();
       // AccessModifier.method2();
       // AccessModifier.method3();
    }


}
