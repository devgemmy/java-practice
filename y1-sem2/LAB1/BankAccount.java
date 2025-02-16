public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int acctNum, String acctHName) {
        accountNumber = acctNum;
        accountHolderName = acctHName;
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
