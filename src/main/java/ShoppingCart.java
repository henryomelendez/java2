import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemList;
    private double total;
    private int shippingCharge = 10;
    private static double tax = 0.10;
    private Invoice invoice;
    public ShoppingCart(){
        itemList = new ArrayList<>();
    }
    public ShoppingCart(int shippingCharge){
        this.shippingCharge = shippingCharge;
    }
    public void addItem(Item item) {
        this.itemList.add(item);
    }
    public double calculateTotal() {
        for(Item item : itemList){
            total += item.getPrice() * item.getQuantity();
        }
        if(total < 10){
            total += shippingCharge;
        }
        total *= 1 + tax;
        return total;
    }
    public Invoice shipOrder(String name, String address, String city, String state, int zip){
        this.invoice = new Invoice(name,address,city,state,zip, this , total);
        return this.invoice;
    }
    public String getTotal() {
        return NumberFormat.getCurrencyInstance().format(total);
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public int getShippingCharge() {
        return shippingCharge;
    }

    public static double getTax() {
        return tax;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    @Override
    public String toString() {
        return invoice.toString();
    }

}
