public class OrderController {
    private OrderModel om;
    private OrderView ov;

    public OrderController(OrderModel om, OrderView ov) {
        this.om = om;
        this.ov = ov;
        ov.addController(this);
    }
    public void add(OrderItem io){
        om.addItem(io);
        double t = om.getTotal();
        String o = om.toString();
        ov.setItems(o);
        ov.setTotal(t);
    }

    public void clear(){

    }

}
