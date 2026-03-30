class BankAccount {
    private int balance = 1000;

    public void withdraw(String name, int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(name + " is withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println(name + ": Insufficient balance");
            }
        }
    }
}

class Customer extends Thread {
    BankAccount account;
    String name;

    Customer(BankAccount account, String name) {
        this.account = account;
        this.name = name;
    }

    public void run() {
        account.withdraw(name, 700);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        Customer c1 = new Customer(acc, "User1");
        Customer c2 = new Customer(acc, "User2");

        c1.start();
        c2.start();
    }
}