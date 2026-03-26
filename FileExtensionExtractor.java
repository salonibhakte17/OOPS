import java.util.Scanner;

public class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        int index = fileName.lastIndexOf('.');

        if (index != -1) {
            String extension = fileName.substring(index + 1);
            System.out.println("File Extension: " + extension);
        } else {
            System.out.println("No extension found");
        }
    }
}