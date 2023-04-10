public class OrderController {
    private OrderModel om;
    private OrderView ov;

    public OrderController(OrderModel om, OrderView ov) {
        this.om = om;
        this.ov = ov;
    }
}
