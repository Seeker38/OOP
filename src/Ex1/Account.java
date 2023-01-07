package Ex1;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getID() {
        return id;
    }


    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer.toString() + " balance=$" + (Math.round(balance * 100.0) / 100.0);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        this.balance = this.balance + amount;
        return new Account(this.id, this.customer, balance);
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.balance = this.balance - amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return new Account(id, customer, balance);
    }
}