package ChallengeOne;

public class bankAccount {
    private int AccountNumber;
    private double balance;
    private string customerName;
    private string email;
    private string phoneNumber;

    public int getAccountNumber() {
        return this.AccountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    public string getCustomerName() {
        return this.customerName;
    }
    public string getEmail() {
        return this.email;
    }
    public string getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.AccountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(string customerName) {
        this.customerName = customerName;
    }
    public void setEmail(string email) {
        this.email = email;
    }
    public void setPhoneNumber(string phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public static void incrementBalance() {

    }
    public static void decrementBalance() {
        
    }
}
