package Ex2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(88, "Tan Ah Teck", 'm');
        System.out.println(customer1);

        Account account1 = new Account(88, customer1);
        Account account2 = new Account(99, customer1, 80);
        System.out.println(account1);
        System.out.println(account2);

        account1.setBalance(90);
        System.out.println(account1);
        System.out.println("id is: " + account1.getID());
        System.out.println("customer is: " + account1.getCustomer());
        System.out.println("balance is: " + account1.getBalance());
        System.out.println("customer's name is: " + account1.getCustomerName());

        account1.deposit(10);
        System.out.println(account1);
        System.out.println(account1.getBalance());

        account1.withdraw(20);
        System.out.println(account1);

        account1.withdraw(100);
    }
}
