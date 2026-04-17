import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Product {
    String name;
    double price;
    boolean inStock;

    Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", inStock=" + inStock + "}";
    }
}

public class Filtering {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Notebook", 12.99, true));
        products.add(new Product("Headphones", 89.99, true));
        products.add(new Product("Pen", 1.49, true));
        products.add(new Product("Monitor", 299.99, false));
        products.add(new Product("Mouse", 45.00, true));
        products.add(new Product("Keyboard", 55.00, true));
        products.add(new Product("USB Cable", 8.99, false));
        products.add(new Product("Webcam", 49.99, true));

        Predicate<Product> isAffordable = p -> p.price < 50 && p.inStock;

        products.removeIf(isAffordable.negate());

        products.forEach(System.out::println);
    }
}