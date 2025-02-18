public class Exercise2 {
    public static void main(String[] args) {
        BankAccount currentAccount = new BankAccount(506211, "Tony Stark");
        BankAccount savingsAccount = new BankAccount(134070, "Alex");

        currentAccount.deposit(560);
        currentAccount.getBalance();
        currentAccount.withdraw(145);
        currentAccount.getBalance();

        savingsAccount.withdraw(125);
        savingsAccount.getBalance();
    }
}
