package IconJavaSwing.View;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MainView extends JFrame {
    public MainView() {
        this.setSize(500,500);
        this.setTitle("Icon");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // set Icon
        URL urlIcon = MainView.class.getResource("Icondrawer-Flags-Viet-Nam.48.png");
        Image imgVN = Toolkit.getDefaultToolkit().createImage(urlIcon);
        this.setIconImage(imgVN);

        JMenu menu = new JMenu("Menu");
        JMenu submenu = new JMenu("Submenu");
        JMenuBar jMenuBar = new JMenuBar();
        JMenuItem i1 = new JMenuItem("Item 1");
        JMenuItem i2 = new JMenuItem("Item 2");
        JMenuItem i3 = new JMenuItem("Item 3");
        JMenuItem i4 = new JMenuItem("Item 4");
        JMenuItem i5 = new JMenuItem("Item 5");
        jMenuBar.add(menu);
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(submenu);
        submenu.add(i4);
        submenu.add(i5);

        JLabel jLabel = new JLabel();

        JButton jButton = new JButton("Button");

        this.add(jMenuBar,BorderLayout.NORTH);
        this.add(jLabel,BorderLayout.CENTER);
        this.add(jButton,BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MainView();
    }
}
