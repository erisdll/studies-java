package contructors.exercise1.Program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int accountNumber;
        String accountHolderName;
        double initialDeposit = 0;
        String initialDepositExists;

        System.out.println("Enter account number:");
        accountNumber = scanner.nextInt();
        System.out.println("Enter account holder name:");
        accountHolderName = scanner.next();
        System.out.println("Is there a initial deposit?");
        initialDepositExists = scanner.next();
        if (initialDepositExists.equals("yes")) {
            System.out.println("Enter initial deposit value:");
            initialDeposit = Double.parseDouble(scanner.next());
        }
        Account account = new Account(accountNumber, accountHolderName, initialDeposit);

        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountHolderName());
        System.out.println(account.getAccountBalance());

        System.out.println("Enter a deposit value:");
        account.depositIntoAccount(scanner.nextDouble());

        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountHolderName());
        System.out.println(account.getAccountBalance());

        System.out.println("Enter a withdraw value:");
        account.withdrawFromAccount(scanner.nextDouble());

        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountHolderName());
        System.out.println(account.getAccountBalance());
    }
}
