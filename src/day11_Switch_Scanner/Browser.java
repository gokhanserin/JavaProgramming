package day11_Switch_Scanner;

public class Browser {

    public static void main(String[] args) {

        String browserName = "edge";
        String result;
        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari"
                || browserName == "edge";

        if (validBrowser){
            if (browserName == "Chrome Browser is selected"){
                result = browserName;
            }else if (browserName == "Firefox Browser is selected"){
                result = browserName;
            }else if (browserName == "Opera Browser is selected"){
                result = browserName;
            }else if (browserName == "Safari Browser is selected"){
                result = browserName;
            }else{
                result = "Edge Browser is selected";
            }
            System.out.println(result);

        }else{
            System.out.println("Invalid Browser Name");
        }


    }


}
