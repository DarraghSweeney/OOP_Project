package SecondHandShop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LaunchWindow extends JFrame implements ActionListener{

    JButton Begin = new JButton("Get Started!");


    public LaunchWindow(){

        super("Welcome!");

        BorderLayout layout = new BorderLayout(6,8);
        setLayout(layout);

        JPanel Toppanel = new JPanel();
        JPanel Midpanel = new JPanel();
        JPanel Bottompanel = new JPanel();
        JLabel Welcomelabel = new JLabel("Welcome to the shop system!");
        JLabel Beginlabel = new JLabel("Would you like to begin?");
        Begin.addActionListener(this);
        Toppanel.add(Welcomelabel);
        Midpanel.add(Beginlabel);
        Bottompanel.add(Begin);

        setSize(400,200);
        setVisible(true);

        add(Toppanel,BorderLayout.NORTH);
        add(Midpanel,BorderLayout.CENTER);
        add(Bottompanel,BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==Begin)
        {
            this.dispose();
            ShopGUI Shopgui = new ShopGUI();
        }

    }
}

