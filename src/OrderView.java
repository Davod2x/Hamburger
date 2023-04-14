import javax.swing.*;

public abstract class  OrderView extends JPanel {
    protected JTextArea orderText;
    protected JLabel orderTotal;

    protected OrderController controller;


    public OrderView() {
        orderText = new JTextArea();
        orderTotal = new JLabel();
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
