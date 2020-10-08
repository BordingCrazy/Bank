package ChallengeOne;

public class bankAccount {
    private int AccountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return this.AccountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.AccountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void incrementBalance(double deposit) {
        balance += deposit;
        System.out.println("Your current balance is: " + balance);
    }
    public void decrementBalance(double withdraw) {
        if(balance - withdraw > 0) {
            balance -= withdraw;
            System.out.println("Your current balance is: " + balance);
        }else{
            System.out.println("You cannot withdraw that amount. 'Withdraw' amount is greater than balance.");
        }
    }
}
