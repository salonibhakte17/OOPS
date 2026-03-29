class RailwayReservation {
    int seats = 1;

    synchronized void bookTicket(String name) {
        if (seats > 0) {
            System.out.println(name + " booked ticket successfully");
            seats--;
        } else {
            System.out.println("No tickets available");
        }
    }
}

class UserThread extends Thread {
    RailwayReservation r;
    String name;

    UserThread(RailwayReservation r, String name) {
        this.r = r;
        this.name = name;
    }

    public void run() {
        r.bookTicket(name);
    }
}

class MainReservation {
    public static void main(String[] args) {
        RailwayReservation r = new RailwayReservation();

        UserThread t1 = new UserThread(r, "User1");
        UserThread t2 = new UserThread(r, "User2");

        t1.start();
        t2.start();
    }
}