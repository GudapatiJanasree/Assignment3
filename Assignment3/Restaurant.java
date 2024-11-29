package Assignment3;
//18
class Restaurant {
    private String[] menuItems;
    private double[] prices;
    private double[] ratings;
    private int itemCount;

    public Restaurant(int capacity) {
        menuItems = new String[capacity];
        prices = new double[capacity];
        ratings = new double[capacity];
        itemCount = 0;
    }

    public void addMenuItem(String item, double price, double rating) {
        if (itemCount < menuItems.length) {
            menuItems[itemCount] = item;
            prices[itemCount] = price;
            ratings[itemCount] = rating;
            itemCount++;
            System.out.println(item + " added to the menu.");
        } else {
            System.out.println("Menu is full, cannot add more items.");
        }
    }

    public void removeMenuItem(String item) {
        int index = -1;
        for (int i = 0; i < itemCount; i++) {
            if (menuItems[i].equals(item)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < itemCount - 1; i++) {
                menuItems[i] = menuItems[i + 1];
                prices[i] = prices[i + 1];
                ratings[i] = ratings[i + 1];
            }
            itemCount--;
            System.out.println(item + " removed from the menu.");
        } else {
            System.out.println(item + " not found in the menu.");
        }
    }

    public double calculateAverageRating() {
        if (itemCount == 0) {
            System.out.println("No items in the menu.");
            return 0.0;
        }

        double sum = 0.0;
        for (int i = 0; i < itemCount; i++) {
            sum += ratings[i];
        }
        return sum / itemCount;
    }

    public void displayMenu() {
        if (itemCount == 0) {
            System.out.println("No items in the menu.");
            return;
        }
        
        System.out.println("Restaurant Menu:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(menuItems[i] + " - ₹" + prices[i] + "  Rating: " + ratings[i]);
        }
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(5);

        restaurant.addMenuItem("Pasta", 200, 4.5);
        restaurant.addMenuItem("Pizza", 350, 4.7);
        restaurant.addMenuItem("Burger", 150, 4.0);

        restaurant.displayMenu();

        restaurant.removeMenuItem("Burger");

        System.out.println("\nUpdated Menu:");
        restaurant.displayMenu();

        double averageRating = restaurant.calculateAverageRating();
        System.out.println("\nAverage Rating: " + averageRating);
    }
}

