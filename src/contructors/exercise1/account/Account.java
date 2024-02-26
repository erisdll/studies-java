package contructors.exercise1.account;

public class Account {

    private String accountHolderName;

    private final int accountNumber;
    private double accountBalance;
    public Account(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }
    public Account(String accountHolderName, int accountNumber, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;

    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void depositIntoAccount(double transactionAmount) {
        if (transactionAmount <= 0) {
            throw new IllegalArgumentException("Can't deposit negative values!");
        }
        this.accountBalance = accountBalance + transactionAmount;
    }

    public void withdrawFromAccount(double transactionAmount) {
        if (transactionAmount <= 0) {
            throw new IllegalArgumentException("Can't withdraw negative values!");
        }
        if (transactionAmount > accountBalance) {
            throw new IllegalArgumentException("Insufficient funds!");
        }
        this.accountBalance = accountBalance - transactionAmount;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
