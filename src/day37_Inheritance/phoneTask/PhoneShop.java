package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iPhone = new Iphone("iPhone12", "8.4 inches",1000,"white");

        Samsung samsung = new Samsung("Galaxy s19", "7.4 inches", 900, "black");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "gray");

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);

        iPhone.call(911);
        iPhone.text(123456789);
        iPhone.faceTime(123456789);
        iPhone.faceTime("yahoo@gmail.com");

        System.out.println("---------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("-----------------------------------");

        nokia.call(911);
        nokia.text(123456789);
        nokia.selfDefense();



    }


}
