import java.util.Scanner;

class Resort {
    int Rno, Days;
    String Name;
    double Charges;

    double Compute() {
        double amount = Days * Charges;
        if (amount > 11000)
            amount = 1.02 * amount;
        return amount;
    }

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Room No: ");
        Rno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        Name = sc.nextLine();
        System.out.print("Enter Charges per day: ");
        Charges = sc.nextDouble();
        System.out.print("Enter Days: ");
        Days = sc.nextInt();
    }

    void DispInfo() {
        double amt = Compute();
        System.out.println("Room No: " + Rno);
        System.out.println("Name: " + Name);
        System.out.println("Charges: " + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Total Amount: " + amt);
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}