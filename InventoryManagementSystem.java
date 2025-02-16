// FB-BSIT3-1 JABAO, MARK VINCENT Z.//
import java.util.ArrayList;

class InventoryManagementSystem {
    private ArrayList<Product> products;

    public InventoryManagementSystem() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        products.add(product);
        System.out.println("Added Successfully!");
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Unavailable Products.");
        } else {
            System.out.println("Product List:");
            for (Product product : products) {
                System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice());
            }
        }
    }
}