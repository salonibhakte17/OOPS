import java.util.*;

public class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        int len = password.length();

        if (len <= 2) {
            System.out.println("Masked password: " + password);
        } else {
            String masked = password.substring(0, len - 2)
                    .replaceAll(".", "*") + password.substring(len - 2);

            System.out.println("Masked password: " + masked);
        }
    }
}