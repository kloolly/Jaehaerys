public class Account2 {
//    data
    private static int numAccount=0;
    private String name;
    private double balance;

//    method
    public Account2(String name) {
        numAccount++;
        this.name=name;
        balance=0;
    }
    public Account2(String name, double balance) {
        numAccount++;
        this.name=name;
        this.balance=balance;
    }
    public void deposit(double amount) {
        this.balance+=amount;
    }
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance-=amount;
            return true;
        } return false;
    }
    public String toString() {
        return name+": "+balance;
    }

    public int getNumAccount(){
        return numAccount;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public String setName(String name) {
        return this.name=name;
    }
}
