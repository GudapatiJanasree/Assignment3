package Assignment3;

public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest applied: " + interest);
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("12345", "John Doe", 1000, 5);

        System.out.println("Initial Account Balance:");
        savingsAccount.checkBalance();

        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);

        System.out.println("\nBalance after transactions:");
        savingsAccount.checkBalance();

        savingsAccount.applyInterest();

        System.out.println("\nBalance after interest:");
        savingsAccount.checkBalance();
    }
}
