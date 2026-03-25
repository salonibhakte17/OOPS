class Book {
    String title, author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " | " + author + " | " + price);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Java", "James", 500),
            new Book("Python", "Guido", 600),
            new Book("C++", "Bjarne", 700)
        };

        for (Book b : books) {
            b.display();
        }
    }
}