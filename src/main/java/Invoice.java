import java.io.Serializable;
import java.text.NumberFormat;
import java.util.List;

public class Invoice {
    private String name;
    private String address;
    private String city;
    private String state;
    private int zip;
    private ShoppingCart shoppingCart;
    private double total;
    public Invoice(String name, String address, String city, String state, int zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public Invoice(String name, String address, String city, String state, int zip, ShoppingCart shoppingCart){
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.shoppingCart = shoppingCart;
    }
    public Invoice(String name, String address, String city, String state, int zip, ShoppingCart shoppingCart, double total){
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.shoppingCart = shoppingCart;
        this.total = total;
    }

    @Override
    public String toString() {
        String s = "Ship to:\n" + this.name +
                "\n" + this.address +
                "\n" + this.city + ", " + this.state + " " + this.zip +
                "\n" +
                "Items\n"+
                "------\n";
                for(Item i : shoppingCart.getItemList()){
                    s += i.getName() + " " + NumberFormat.getCurrencyInstance().format(i.getPrice()) + " " + "("+ i.getQuantity()+") "
                    + NumberFormat.getCurrencyInstance().format(i.getPrice() * i.getQuantity()) +"\n";
                }
                s+= "\n"
                +"Shipping: ";
                double total = (this.total / 1.10 - 10);
                s += (total > 10) ? NumberFormat.getCurrencyInstance().format(shoppingCart.getShippingCharge()) : "Free";
                s+=
                "\n"
                + "Total Cost\n"
                + "-------\n"
                + ((this.total > 10) ? NumberFormat.getCurrencyInstance().format(this.total) : "Free") ;


        return s;
    }
}
