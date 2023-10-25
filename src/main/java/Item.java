import java.text.NumberFormat;

public class Item {
    private float price;
    private int quantity;
    private String name;
    public Item(float price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " " + NumberFormat.getCurrencyInstance().format(this.price) + " (" + this.quantity + ") ";
    }
}
