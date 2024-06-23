public class Account {
//    data
    static int numAccount=0;
    String name;
    double balance;

//    method
    public Account(String name) {
        numAccount++;
        this.name=name;
        balance=0;
    }
    public Account(String name, double balance) {
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
}
