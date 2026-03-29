class FileProcessingSystem {
    public static void main(String[] args) {

        try {
            System.out.println("Reading file...");
            
            // Simulating file reading
            int data = 10 / 2;

        } catch (Exception e) {
            System.out.println("Error while reading file");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}