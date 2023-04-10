import javax.swing.*;

public abstract class  OrderView extends JPanel {
    private JTextArea orderText;
    private JLabel orderTotal;

    private OrderController controller;


    public OrderView() {
        initComponets();
    }


    public abstract void initComponets();

    public void setItems(String s){
        orderText.setText(s);

    }

    public void setTotal (double d){
        orderTotal.setText(String.valueOf(d));

    }

    public void addController(OrderController c){
        this.controller = c;

    }


}
