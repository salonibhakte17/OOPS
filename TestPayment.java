abstract class Payment {
    abstract void pay(double amount);
}

class CreditCard extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class Cash extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}

class TestPayment {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCard();
        p.pay(1000);

        p = new UPI();
        p.pay(500);

        p = new Cash();
        p.pay(200);
    }
}