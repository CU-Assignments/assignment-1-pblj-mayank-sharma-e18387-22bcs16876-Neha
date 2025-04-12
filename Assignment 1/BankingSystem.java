// Problem 3: Basic Banking System (Hard Level)
// **Description:**  
// Create a Java program that implements a basic **banking system** with the following features:
// - **Account creation** (Name, Account Number, Balance)
// - **Deposit and withdrawal operations**
// - **Prevent overdraft** by checking the balance before withdrawal
// - **Use encapsulation** (private variables with public getters/setters)

// **Example Input:**
// ```
// Create Account:
// Name: John Doe
// Account Number: 12345
// Initial Balance: 1000

// Deposit: 500
// Withdraw: 2000
// ```
// **Example Output:**
// ```
// Deposit successful! Current Balance: 1500
// Error: Insufficient funds. Current Balance: 1500

import java.util.Scanner;

class Account {
    private String name;
    private int accountNumber;
    private double balance;

    public void createAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        } else {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void showDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();

        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Account Number: ");
        int accNum = sc.nextInt();
        System.out.print("Initial Balance: ");
        double bal = sc.nextDouble();

        acc.createAccount(name, accNum, bal);

        System.out.print("Deposit: ");
        double deposit = sc.nextDouble();
        acc.deposit(deposit);

        System.out.print("Withdraw: ");
        double withdraw = sc.nextDouble();
        acc.withdraw(withdraw);
    }
}
