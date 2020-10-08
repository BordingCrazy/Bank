package ChallengeOne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bankAccount account = new bankAccount();
        account.setAccountNumber(12345);
        account.setBalance(13.25);
        account.setCustomerName("Danny Doorstep");
        account.setEmail("billys@hotmail.com");
        account.setPhoneNumber("1234-567");

        while(true) {

            System.out.println("Please enter your Name:");
            String name = sc.nextLine();

            if(name.equalsIgnoreCase(account.getCustomerName())) {//will fail if user inputs the wrong name.
                break;
            }else {
                System.out.println("WOOPS wrong name... \ntry again.");
            }
        }

        while(true) {

            System.out.println("what is your account number?");
            boolean isInt = sc.hasNextInt();//check if the user inputted a number.

            if(isInt) {
                int accountNum = sc.nextInt();

                if (accountNum == account.getAccountNumber()) {
                    break;

                } else {
                    System.out.println("WOOPS that was the wrong account#... \ntry again.");
                }
            }else{
                System.out.println("WOOPS there was a non number... \ntry again.");
            }
            sc.nextLine();
        }

        sc.nextLine();//So the next user input is not ignored.

        System.out.println("Are these both your email & phone number? " +
                account.getEmail() + " - " + account.getPhoneNumber() + "\nyes or no");
        String informationAns = sc.nextLine();//check if the user's info is correct.

        if(informationAns.equalsIgnoreCase("no")) {
            System.out.println("Which would you like to change? \nEMAIL \nPHONE \nBOTH \nNONE");
            String changeInfo = sc.nextLine();

            switch (changeInfo) {
                case "EMAIL":
                    System.out.println("Please enter new email...");
                    account.setEmail(sc.nextLine());
                    break;
                case "PHONE":
                    System.out.println("Please enter new email...");
                    account.setPhoneNumber(sc.nextLine());
                    break;
                case "BOTH":
                    System.out.println("Please enter new email and then phone number after...");
                    account.setEmail(sc.nextLine());
                    account.setPhoneNumber(sc.nextLine());
                    break;
                case "NONE":
                    System.out.println("Aight I guess...");
                    break;
            }
        }else if(informationAns.equalsIgnoreCase("yes")){
            System.out.println("Okay...");
        }

        System.out.println("Phone number is: " + account.getPhoneNumber() + " and email is: " + account.getEmail());

        System.out.println("Welcome " + account.getCustomerName() + ", please type out which option you want...");
        System.out.println("WITHDRAW \nDEPOSIT \nBALANCE");
        String handleMoney = sc.nextLine();
        switch(handleMoney) {
            case "WITHDRAW":
                System.out.println("Type how much you would like to withdraw: ");
                account.decrementBalance(sc.nextDouble());
                break;
            case "DEPOSIT":
                System.out.println("Type how much you would like to deposit: ");
                account.incrementBalance(sc.nextDouble());
                break;
            case "BALANCE":
                System.out.println("Your current balance is: " + account.getBalance());
        }
        sc.close();//close user input.
    }
}
