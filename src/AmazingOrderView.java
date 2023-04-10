import javax.swing.*;
import java.awt.*;

public class AmazingOrderView extends OrderView{

    @Override
    public void initComponets() {
        //setPreferredSize(new Dimension());
        BoxLayout bl = new BoxLayout(this,BoxLayout.Y_AXIS);
      //  orderText.setPreferredSize(new Dimension(20,20));
        setLayout(bl);
        JPanel items = new JPanel();
        JPanel citems = new JPanel();
        JPanel text = new JPanel();
        JPanel total = new JPanel();
        JLabel info = new JLabel("Order items");
        JLabel info2 = new JLabel("Whole Order View");
        JLabel info3 = new JLabel("Combo Items");
        info.setAlignmentX(CENTER_ALIGNMENT);
        info2.setAlignmentX(CENTER_ALIGNMENT);

        Icon icon = new ImageIcon("Hamburger.PNG");
        Icon icon2 = new ImageIcon("ChickenSandwich.JPG");
        Icon icon3 = new ImageIcon("Fries.JPG");
        Icon icon4 = new ImageIcon("Soda.JPG");
        Icon icon5 = new ImageIcon("CSCombo.JPG");
        Icon icon6 = new ImageIcon("HBCombo.PNG");
        JButton button1 = new JButton(icon);
        JButton button2 = new JButton(icon2);
        JButton button3 = new JButton(icon3);
        JButton button4 = new JButton(icon4);
        JButton button5 = new JButton(icon5);
        JButton button6 = new JButton(icon6);
        button1.setPreferredSize(new Dimension(200, 200));
        button2.setPreferredSize(new Dimension(200, 200));
        button3.setPreferredSize(new Dimension(200, 200));
        button4.setPreferredSize(new Dimension(200, 200));
        button5.setPreferredSize(new Dimension(200, 200));
        button6.setPreferredSize(new Dimension(200, 200));
        items.add(button1);
        items.add(button2);
        items.add(button3);
        items.add(button4);
        citems.add(button5);
        citems.add(button6);
        orderText.setPreferredSize(new Dimension(800,200));
        orderTotal.setText("Total Amount:" );
        text.add(orderText);
        total.add(orderTotal);
        add(info);
        add(items);
        add(info3);
        add(citems);
        add(info2);
        add(text);
        add(total);









    }
}
