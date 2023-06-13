public class BankAccount {
    //Encapsulation
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // No args constructor
    public BankAccount() {
        // this() statement must be the first line called in the constructor
        this(56789, 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, String phoneNumber){
        System.out.println("Constructor with args");

        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public BankAccount(String customerName, String email, String phoneNumber) {
        this(999999, 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        accountBalance+=amount;
        System.out.println("You deposited $" + amount + ". Your balance is now: $" + accountBalance);
    }

    public void withdrawFunds(double amount){
        if (accountBalance==0){
            System.out.println("Insufficient funds. Come back later");
        }
        else{
            accountBalance -= amount;
            System.out.println("You withdrew $" + amount + ". Your balance is now: $" + accountBalance);
        }
    }
}
