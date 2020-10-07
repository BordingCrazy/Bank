package ChallengeOne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner();

        bankAccount account = new bankAccount();
        account.setAccountNumber(12345);
        account.setBalance(13.25);
        account.setCustomerName("Daniel Dorsett");
        account.setEmail("d.thor@hotmail.com");
        account.setPhoneNumber("1234-567");

        System.out.println();
        System.out.println("Please type withdraw to take out money or deposit to put in money.");

        System.out.println(account.getCustomerName() + " wants to deposit " + deposit + ": Your current balance is " +
                account.incrementBalance(3.30));

    }
}
