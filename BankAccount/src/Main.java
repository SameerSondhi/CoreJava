public class Main {
    public static void main(String[] args){
//        BankAccount account = new BankAccount(12345678, 50000.00, "Tim Buchalka", "tim@buchalka.com", "4089738864");
        BankAccount account2 = new BankAccount();
//        account.setAccountNumber(12345678);
//        account.setAccountBalance(50000.00);
//        account.setCustomerName("Tim Buchalka");
//        account.setEmail("tim@buchalka.com");
//        account.setPhoneNumber("4089738864");
        System.out.println(account2.getAccountNumber());
        System.out.println(account2.getAccountBalance());


        account2.depositFunds(4500.00);
        account2.withdrawFunds(5000.00);

        BankAccount samsAccount = new BankAccount("Sam", "sam@email.com", "2345678");
        System.out.println("Account number: " + samsAccount.getAccountNumber());


    }
}
