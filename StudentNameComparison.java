import java.util.Scanner;

public class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second name: ");
        String name2 = sc.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Case-sensitive: Names are equal");
        } else {
            System.out.println("Case-sensitive: Names are NOT equal");
        }
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Case-insensitive: Names are equal");
        } else {
            System.out.println("Case-insensitive: Names are NOT equal");
        }
    }
}