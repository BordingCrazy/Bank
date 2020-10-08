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

        boolean check = true;

        while(check) {

            System.out.println("Please enter your Name:");
            String name = sc.nextLine();

            if(name.equalsIgnoreCase(account.getCustomerName())) {

                System.out.println("what is your email?");
                String email = sc.nextLine();

                if(email.equals(account.getEmail())) {

                    while(check) {
                        System.out.println("Is this your phone number?" + account.getPhoneNumber() + "\nyes or no");
                        String phoneAnswer = sc.nextLine();
                        if(phoneAnswer.equalsIgnoreCase("yes")) {
                            System.out.println("OK...");
                            check = false;
                        }else if(phoneAnswer.equalsIgnoreCase("no")) {
                            System.out.println("Would you like to change it? \nyes or no");
                            String changePhone = sc.nextLine();
                            switch (changePhone){
                                case "yes":
                                    System.out.println("Please enter phone#:");
                                    String newPhone = sc.nextLine();
                                    account.setPhoneNumber(newPhone);
                                    check = false;
                                    break;
                                case "no":
                                    System.out.println("Aight bro...");
                                    check = false;
                                    break;
                            }
                        }
                    }
                }else {
                    System.out.println("WOOPS wrong email... \ntry again.");
                }
            }else {
                System.out.println("WOOPS wrong name... \ntry again.");
            }
        }
        sc.close();

        System.out.println("Welcome " + account.getCustomerName() + ", please type out which option you want...");
        System.out.println("WITHDRAW \nDEPOSIT \nBALANCE");
        System.out.println("Please type withdraw to take out money or deposit to put in money.");

        System.out.println("Phone number is: " + account.getPhoneNumber());

    }
}
