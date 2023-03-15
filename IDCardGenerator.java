import java.util.HashMap;
import java.util.Scanner;

public class IDCardGenerator {

    static HashMap<String, String> idCardData = new HashMap<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=====================");
            System.out.println("ID Card Generator Menu");
            System.out.println("=====================");
            System.out.println("1. Generate New ID Card");
            System.out.println("2. View Existing ID Cards");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    generateIDCard(input);
                    break;
                case 2:
                    viewIDCards();
                    break;
                case 3:
                    System.out.println("Exiting ID Card Generator System...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void generateIDCard(Scanner input) {
        input.nextLine(); // consume the newline character

        // Get personal information from user
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // consume the newline character
        System.out.print("Enter your address: ");
        String address = input.nextLine();
        System.out.print("Enter your ID number: ");
        String idNumber = input.nextLine();

        // Generate ID card data and store it in hashmap
        String idCardInfo = "Name: " + firstName + " " + lastName + ", Age: " + age + ", Address: " + address + ", ID Number: " + idNumber;
        idCardData.put(idNumber, idCardInfo);

        // Display generated ID card
        System.out.println("\nGenerating ID card...\n");
        System.out.println("**********************************");
        System.out.println("*          ID Card                *");
        System.out.println("**********************************");
        System.out.println("*  Name: " + firstName + " " + lastName);
        System.out.println("*  Age: " + age);
        System.out.println("*  Address: " + address);
        System.out.println("*  ID Number: " + idNumber);
        System.out.println("**********************************");
    }

    private static void viewIDCards() {
        System.out.println("\nViewing ID cards...\n");
        System.out.println("**********************************");
        for (String idNumber : idCardData.keySet()) {
            System.out.println("*  " + idCardData.get(idNumber));
        }
        System.out.println("**********************************");
    }
}
