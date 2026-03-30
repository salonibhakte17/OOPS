class Restaurant {
    private boolean foodReady = false;

    public synchronized void prepareFood() {
        try {
            System.out.println("Chef is preparing food...");
            Thread.sleep(1000);

            foodReady = true;
            System.out.println("Chef prepared food");

            notify(); // notify waiter
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void serveFood() {
        try {
            while (!foodReady) {
                wait(); // wait for chef
            }

            System.out.println("Waiter served food");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Chef extends Thread {
    Restaurant r;

    Chef(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.prepareFood();
    }
}

class Waiter extends Thread {
    Restaurant r;

    Waiter(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.serveFood();
    }
}

public class Main {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        Chef chef = new Chef(r);
        Waiter waiter = new Waiter(r);

        waiter.start();
        chef.start();
    }
}