// FB-BSIT3-1 JABAO, MARK VINCENT Z.//
import java.util.Scanner;

public class InventoryManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManagementSystem ims = new InventoryManagementSystem();

        System.out.println("Welcome to Inventory Management System!");
        System.out.println("by: Mark Vincent Z. Jabao");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a Product");
            System.out.println("2. Display Products");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    ims.addProduct(name, price);
                    break;
                case 2:
                    ims.displayProducts();
                    break;
                case 3:
                    System.out.println("Go Go Goodbye! ");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
