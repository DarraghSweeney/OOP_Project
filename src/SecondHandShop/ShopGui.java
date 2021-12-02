package SecondHandShop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ShopGui extends JFrame {

    public ShopGui(){

        super("Welcome!");

        BorderLayout layout = new BorderLayout(6,8);
        setLayout(layout);

        JPanel panel = new JPanel(new BorderLayout(1,1));
        JLabel label = new JLabel("Welcome to the shop system!,\nwould you like to begin?");
        JButton Begin = new JButton("Get Started!");

        panel.add(label,BorderLayout.NORTH);
        panel.add(Begin,BorderLayout.CENTER);

        setSize(400,400);
        setVisible(true);

        add(panel);
    }
}
