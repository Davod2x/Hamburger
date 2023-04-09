import java.util.ArrayList;

public class OrderModel {
    private ArrayList<OrderItem> orders;

    public OrderModel() {
        orders = new ArrayList<OrderItem>();
        this.orders = orders;

    }

    public void addItem(OrderItem oi){
        orders.add(oi);
    }

    public void clear(){
        orders.clear();
    }
    public double getTotal(){
        double total = 0;
        for (int i = 0; i < orders.size(); i++){
            total +=((OrderItem)orders.get(i)).getPrice();
            //items.get(i).
        }
        return total;

    }


}
