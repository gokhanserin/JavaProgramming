package day31;

public class CapitalOne {

    public static void main(String[] args) {

        BancAccount account1 = new BancAccount();
        account1.setInfo("Ahmet Ozkok",123456789);
        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();
        account1.deposit(900);
        account1.checkBalance();


        System.out.println("-----------------------------------");

        BancAccount account2 = new BancAccount();
        account2.setInfo("Aygun", 452111447);
        account2.deposit(10000);
        account2.checkBalance();



    }


}
