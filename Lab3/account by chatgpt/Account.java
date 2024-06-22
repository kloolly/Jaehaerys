public class Account {
    // Static variable to keep track of the number of accounts
    public static int numAccount = 0;

    // Instance variables
    public String name;
    public double balance;

    // Constructor for Account with only name
    public Account(String name) {
        this.name = name;
        this.balance = 0;
        numAccount++;
    }

    // Constructor for Account with name and initial balance
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
        numAccount++;
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // Method to withdraw amount from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    // Override the toString method to return account details
    @Override
    public String toString() {
        return this.name + ": " + this.balance;
    }

    // Getter for the number of accounts
    public static int getNumAccount() {
        return numAccount;
    }

    public static void main(String[] args) {
        // This main method is only for testing purposes.
        // The TestAccount.java file should be used as specified.

        // Create accounts
        Account account1 = new Account("Aby Alan", 500.0);
        Account account2 = new Account("Ben Bowe");
        Account account3 = new Account("Cho Cohn", 500.0);

        // Print account details
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

        // Test deposit and withdraw methods
        System.out.println(account1.withdraw(100)); // true
        account2.deposit(100); // deposit
        System.out.println(account2.withdraw(200)); // false

        // Print account details after transactions
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
    }
}