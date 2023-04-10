public class Product implements OrderItem{
    private String itemName;
    private double price = 0;

    public Product(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    public String getitemName() {
        return itemName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                '}';
    }
}
