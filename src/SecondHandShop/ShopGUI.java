package SecondHandShop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.SocketOption;
import java.util.jar.JarEntry;

public class ShopGUI extends JFrame implements ActionListener {

    JButton GamesButton = new JButton("Games");
    JButton ConsoleButton = new JButton("Games Consoles");
    JButton DevicesButton = new JButton("Devices");
    JButton ComputersButton = new JButton("Computers");
    JMenu fileMenu, EditMenu;

    public ShopGUI(){

        super("Home");

        createFileMenu();
        createEditMenu();
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.setBackground(Color.yellow);
        BorderLayout layout = new BorderLayout(6,8);
        setLayout(layout);

        JPanel Toppanel = new JPanel();
        JPanel Midpanel = new JPanel();
        JPanel Bottompanel = new JPanel();

        GamesButton.addActionListener(this);
        ConsoleButton.addActionListener(this);
        DevicesButton.addActionListener(this);
        ComputersButton.addActionListener(this);

        Midpanel.add(GamesButton);
        Midpanel.add(ConsoleButton);
        Midpanel.add(DevicesButton);
        Midpanel.add(ComputersButton);

        setSize(400,200);
        setVisible(true);

        add(Toppanel,BorderLayout.NORTH);
        add(Midpanel,BorderLayout.CENTER);
        add(Bottompanel,BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void createEditMenu() {
    }

    private void createFileMenu() {
        JMenuItem item;

        fileMenu = new JMenu("File");
        item = new JMenuItem("Quit");
        item.addActionListener(this);

        fileMenu.add(item);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==GamesButton)
        {
            System.out.print("Games");
        }

        else if(e.getSource()==ConsoleButton)
        {
            System.out.print("Console");
        }

        else if(e.getSource()==DevicesButton)
        {
            System.out.print("Devices");
        }

        else if(e.getSource()==ComputersButton)
        {
            System.out.print("Computers");
        }

        String MenuName;
        MenuName = e.getActionCommand();

        if (MenuName.equals("Quit")) {
            int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Quit?", JOptionPane.YES_NO_OPTION);

            if(answer == JOptionPane.YES_OPTION)
                System.exit(0);

            else if (answer == JOptionPane.NO_OPTION)
                return;
        }
    }


}
