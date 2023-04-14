import java.util.ArrayList;

public class Combo implements OrderItem{
    private ArrayList<OrderItem> items;




    public Combo() {
        items = new ArrayList<OrderItem>();
        this.items = items;
    }

    @Override
    public String getitemName() {
        String yes = " ";
        for (int i = 0; i < items.size(); i++){
            yes += String.valueOf(items.indexOf(i));
        }
        return yes;
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (int i = 0; i < items.size(); i++){
            price +=((OrderItem)items.get(i)).getPrice();
            //items.get(i).
        }
        price = price + price/10;
       // String.format(2f, price);
        return price;
    }

    @Override
    public String toString() {

        return "Combo:" +
                getitemName() + "\t Price  " + getPrice() +
                '\n';
    }

    public void addItem(OrderItem oi){
        items.add(oi);
    }
}
