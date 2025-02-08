public class BankAccount {
    private double balance;
    private int accountNumber;
    private String accountHolderName;

    public BankAccount(int accountN, String accountHN) {
        accountNumber = accountN;
        accountHolderName = accountHN;
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
        if (balance <= 0) {
            System.out.println("Insufficient balance.");
        }
    }

    public void getBalance() {
        System.out.println(accountHolderName + ", Your balance is: " + balance);
    }
}
