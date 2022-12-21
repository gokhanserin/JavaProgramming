package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {
/*
        String name = "Trump Tower";
        String building_number = "129";
        String street_name = "Ihlara";
        String city = "İstanbul";
        String state = "VA";
        String zipCode = "145678";
*/

        String name = "Trump Tower",
                building_number = "129",
                street_name = "Ihlara",
                city = "İstanbul",
                state = "VA",
                zipCode = "145678";


        // System.out.println(name + "\n" + building_number + " " + street_name + "\n" + city + ", " + state + " " + zipCode);

        String shipping_address = name + "\n" + building_number + " " + street_name + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(shipping_address);




    }


}
