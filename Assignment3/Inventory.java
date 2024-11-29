package Assignment3;

class Product {
    String name;
    int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Inventory {
    Product[] products;
    int productCount;

    public Inventory(int capacity) {
        products = new Product[capacity];
        productCount = 0;
    }

    public void addProduct(String name, int quantity) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getName().equals(name)) {
                products[i].setQuantity(products[i].getQuantity() + quantity);
                System.out.println(quantity + " units of " + name + " added.");
                return;
            }
        }
        if (productCount < products.length) {
            products[productCount] = new Product(name, quantity);
            productCount++;
            System.out.println(quantity + " units of " + name + " added to inventory.");
        } else {
            System.out.println("Inventory is full, can't add more products.");
        }
    }

    public void removeProduct(String name, int quantity) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getName().equals(name)) {
                if (products[i].getQuantity() >= quantity) {
                    products[i].setQuantity(products[i].getQuantity() - quantity);
                    System.out.println(quantity + " units of " + name + " removed.");
                } else {
                    System.out.println("Not enough stock of " + name + " to remove.");
                }
                return;
            }
        }
        System.out.println(name + " not found in inventory.");
    }

    public void checkLowInventory(int threshold) {
        System.out.println("\nProducts with stock below " + threshold + ":");
        for (int i = 0; i < productCount; i++) {
            if (products[i].getQuantity() < threshold) {
                System.out.println(products[i].getName() + " - Stock: " + products[i].getQuantity());
            }
        }
    }

    public void displayInventory() {
        System.out.println("\nInventory:");
        for (int i = 0; i < productCount; i++) {
            System.out.println(products[i].getName() + " - Stock: " + products[i].getQuantity());
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory(10);

        inventory.addProduct("Laptop", 10);
        inventory.addProduct("Smartphone", 20);
        inventory.addProduct("Tablet", 5);

        inventory.displayInventory();

        inventory.removeProduct("Smartphone", 5);
        inventory.removeProduct("Tablet", 10);

        inventory.checkLowInventory(10);

        inventory.displayInventory();
    }
}
