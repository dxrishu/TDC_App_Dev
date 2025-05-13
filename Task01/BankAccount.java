package DSA;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accNo, String holderName, double initialBalance) {
        this.accountNumber = accNo;
        this.accountHolderName = holderName;
        this.balance = Math.max(0, initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) balance -= amount;
        else System.out.println("Insufficient balance or invalid amount!");
    }

    public void displayDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe", 5000);
        account.deposit(1500);
        account.withdraw(2000);
        account.displayDetails();
    }
}

