class Chat {
    public synchronized void sendMessage(String msg) {
        System.out.println("Sending: " + msg);
        try {
            Thread.sleep(500);
        } catch (Exception e) {}
    }

    public synchronized void receiveMessage(String msg) {
        System.out.println("Received: " + msg);
    }
}

class Sender extends Thread {
    Chat chat;

    Sender(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        chat.sendMessage("Hello!");
        chat.sendMessage("How are you?");
    }
}

class Receiver extends Thread {
    Chat chat;

    Receiver(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        chat.receiveMessage("Hi!");
        chat.receiveMessage("I am fine.");
    }
}

public class ChatApplication {
    public static void main(String[] args) {
        Chat chat = new Chat();

        Sender s = new Sender(chat);
        Receiver r = new Receiver(chat);

        s.start();
        r.start();
    }
}