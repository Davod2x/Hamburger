public class Main {


    public static void main(String[] args) {
        Product Pizza = new Product("Pizza",5);
        Product Burger = new Product("Burger",7.50);
        Product Chicken = new Product("Chicken",6);

        OrderModel om = new OrderModel();
        om.addItem(Pizza);
        om.addItem(Burger);
        om.addItem(Chicken);
        System.out.println(om);
        System.out.println(om.getTotal());



        System.out.println("Hello world!");
    }
}
