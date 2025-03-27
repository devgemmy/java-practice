package Exercise2;

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int acctNum, String acctHName) {
        this.accountNumber = acctNum;
        this.accountHolderName = acctHName;
        this.balance = 0;
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
        if (balance < 0) {
            balance = 0;
            System.out.println(accountHolderName + ", Your balance is: " + balance);
        } else System.out.println(accountHolderName + ", Your balance is: " + balance);
    }
}
