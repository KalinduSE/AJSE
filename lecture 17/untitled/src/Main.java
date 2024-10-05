import java.util.ArrayList;

class Customer {
    protected String name;
    protected String customerType;

    public Customer(String name, String customerType) {
        this.name = name;
        this.customerType = customerType;
    }
}

class GoldCustomer extends Customer {
    public GoldCustomer(String name) {
        super(name, "Gold");
    }
}

class NormalCustomer extends Customer {
    public NormalCustomer(String name) {
        super(name, "Normal");
    }
}

class Item {
    protected String name;
    protected double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Pizza extends Item {
    private boolean isVeg;

    public Pizza(String name, double price, boolean isVeg) {
        super(name, price);
        this.isVeg = isVeg;
    }
}

class Beverage extends Item {
    public Beverage(String name, double price) {
        super(name, price);
    }
}

class Order {
    private String orderType;
    private Customer customer;
    private ArrayList<Item> items;

    public Order(String orderType, Customer customer) {
        this.orderType = orderType;
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (orderType.equals("Delivery") && items.size() >= 5) {
            System.out.println("Delivery orders can only include a maximum of five items.");
        } else {
            items.add(item);
        }
    }

    public double calculateBill() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        if (total > 5000) {
            total *= 0.9; // 10% discount
        }
        return total;
    }
}

class PizzaShop {
    private int totalPizzasMade;
    private ArrayList<String> promotionMessages;

    public PizzaShop() {
        this.totalPizzasMade = 0;
        this.promotionMessages = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        totalPizzasMade++;
    }

    public int getTotalPizzasMade() {
        return totalPizzasMade;
    }

    public void sendPromotion(Customer customer) {
        if (customer instanceof GoldCustomer) {
            promotionMessages.add("Promotion message sent to " + customer.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PizzaShop shop = new PizzaShop();

        // Creating customers
        GoldCustomer goldCustomer = new GoldCustomer("Alice");
        NormalCustomer normalCustomer = new NormalCustomer("Bob");

        // Creating items
        Pizza vegPizza = new Pizza("Veg Pizza", 1200, true);
        Pizza nonVegPizza = new Pizza("Non-Veg Pizza", 1500, false);
        Beverage beverage = new Beverage("Cola", 200);

        // Creating an order
        Order order = new Order("Delivery", goldCustomer);
        order.addItem(vegPizza);
        order.addItem(nonVegPizza);
        order.addItem(beverage);

        // Adding pizzas to the shop
        shop.addPizza(vegPizza);
        shop.addPizza(nonVegPizza);

        // Calculating bill
        System.out.println("Total bill: " + order.calculateBill());

        // Sending promotion
        shop.sendPromotion(goldCustomer);

        // Getting total number of pizzas made
        System.out.println("Total pizzas made: " + shop.getTotalPizzasMade());
    }
}
