package day12_Scanner;
    import java.util.Scanner;
public class ShippingAddress {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your building number");
        String buildingNo = input.next();

        System.out.println("Enter your street number");
        String streetNo = input.next();

        input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String state = input.nextLine();

        System.out.println("Enter your zip code");
        String zip = input.next();

        input.nextLine();

        System.out.println("Enter your country");
        String country = input.nextLine();

        System.out.println(fullName + "\n" + buildingNo + " " + streetNo + "\n" + cityName + " " + state + " " + zip);

        input.close();


    }


}

/*
1. Enter your full name
2. Enter your building number
3. Enter your street number
4. Enter your city name
5. Enter your state
6. Enter your zip code
Display the shipping address

John Smith
7925 Jones Branch Dr
McLean, VA 22012
 */