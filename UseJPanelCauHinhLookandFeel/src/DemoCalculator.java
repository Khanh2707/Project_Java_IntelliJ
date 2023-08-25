import javax.swing.*;
import java.awt.*;

public class DemoCalculator extends JFrame {
    public DemoCalculator() {
        this.setTitle("Calculator");
        this.setSize(400,500);
        this.setLocationRelativeTo(null);


        JTextField jtf = new JTextField();
        JPanel head = new JPanel();
        head.setLayout(new BorderLayout());
        head.add(jtf,BorderLayout.CENTER);

        JButton jb0 = new JButton("0");
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");
        JButton jb6 = new JButton("6");
        JButton jb7 = new JButton("7");
        JButton jb8 = new JButton("8");
        JButton jb9 = new JButton("9");
        JButton jb_cong = new JButton("+");
        JButton jb_tru = new JButton("-");
        JButton jb_nhan = new JButton("*");
        JButton jb_chia = new JButton("/");
        JButton jb_bang = new JButton("=");

        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(5,3));
        buttons.add(jb0);
        buttons.add(jb1);
        buttons.add(jb2);
        buttons.add(jb3);
        buttons.add(jb4);
        buttons.add(jb5);
        buttons.add(jb6);
        buttons.add(jb7);
        buttons.add(jb8);
        buttons.add(jb9);
        buttons.add(jb_cong);
        buttons.add(jb_tru);
        buttons.add(jb_nhan);
        buttons.add(jb_chia);
        buttons.add(jb_bang);

        this.setLayout(new BorderLayout());
        this.add(head,BorderLayout.NORTH);
        this.add(buttons,BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new DemoCalculator();
    }
}
