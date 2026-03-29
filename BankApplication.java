class BankApplication {

    static void processTransaction(int amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Invalid transaction");
        } else {
            System.out.println("Transaction processed");
        }
    }

    public static void main(String[] args) {
        try {
            processTransaction(100); // change value to test exception
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}