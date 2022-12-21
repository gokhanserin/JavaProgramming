package day24_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("cydeo", "school");

        System.out.println("----------------------------");

        domain("john.smith@gmail.com");

        System.out.println("----------------------------");

        nameOfMonth(15);

        System.out.println("----------------------------");

        nameOfDay(4);

        System.out.println("----------------------------");

        daysOfMonth("Mar");

        System.out.println("----------------------------");

        ageGroups(0);



    }

    //1. Create a method that can display the initials of the person.    initials(String firstName, String lastName)

    public static void initials(String firstName, String lastName){
        String initials = firstName.charAt(0) + "." + lastName.charAt(0);
        initials = initials.toUpperCase();
        System.out.println("initials = " + initials);
    }

    //2. Create a method that can display the domain of the email.  domain(String email)

    public static void domain(String email){
        String domain = email.substring(email.indexOf('@')+1, email.lastIndexOf('.') );
        System.out.println(domain);
    }

    //3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number){
        String month = "";
        if (number>=1 && number<=12){
            month =   number==1 ? "Jan" : number==2 ? "Feb" : number==3 ? "Mar" : number==4 ? "Appr" :
                    number==5 ? "May" : number==6 ? "Jun" : number==7 ? "Jul" : number==8 ? "Aug" :
                            number==9 ? "Sep" : number==10 ? "Oct" : number == 11 ? "Nov" : "Dec";
        }else{
            month = "Invalid";
        }

        System.out.println("month = " + month);
    }

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number){
        String day = "";
        if (number>=1 && number<=7){
            day =  number==1 ? "Mon" : number==2 ? "Tue" : number==3 ? "Wed" : number==4 ? "Thur" :
                    number==5 ? "Fri" : number==6 ? "Sat" : "Sun";
        }else{
            day = "Invalid";
        }
        System.out.println("day = " + day);
    }

    //5. Create a method that can print how many days a month has

    public static void daysOfMonth(String month){
        int number = month=="Jan" ? 31 : month=="Feb" ? 28 : month=="Mar" ? 31 : month=="App" ? 30 :
                month=="May" ? 30 : month=="Jun" ? 30 : month=="Jul" ? 31 : month=="Aug" ? 30 :
                        month=="Sep" ? 30 : month=="Oct" ? 31 : month=="Nov" ? 30 : 31;
        System.out.println("number = " + number);
    }

    /*
    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
     */

    public static void ageGroups(int age){
        String ageGroup = "";
        if (age>=1){
            if (age>=1 && age<=2){
                ageGroup="Infant";
            }else if (age>=3 && age<=5){
                ageGroup="Toddler";
            }else if (age>=6 && age<=9){
                ageGroup="Kid";
            }else if (age>=10 && age<=12){
                ageGroup="Ptr-Teen";
            }else if (age>=13 && age<=17){
                ageGroup="Teenager";
            }else if (age>=18 && age<=20){
                ageGroup="Young Adult";
            }else if (age>=21 && age<=39){
                ageGroup="Adult";
            }else if (age>=40 && age<=49){
                ageGroup="Young Middle-Aged Adult";
            }else if (age>=50 && age<=54){
                ageGroup="Middle-Aged Adult";
            }else if (age>=55 && age<=64){
                ageGroup="Very Young Senior Citizen";
            }else if (age>=65 && age<=74){
                ageGroup="Young Senior Citizen";
            }else if (age>=75 && age<=84){
                ageGroup="Senior Citizen";
            }else{
                ageGroup="Old Senior Citizen";
            }
        }else{
            ageGroup = "Invalid";
        }
        System.out.println("ageGroup = " + ageGroup);
    }

}
