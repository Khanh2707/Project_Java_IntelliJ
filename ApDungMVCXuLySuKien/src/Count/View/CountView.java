package Count.View;

import Count.Controller.CountListen;
import Count.Model.CountModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CountView extends JFrame {
    private CountModel cm;
    private JButton up;
    private JButton down;
    private JButton reset;
    private JLabel jLabel;

    public CountView() {
        this.cm = new CountModel();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Count");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener al = new CountListen(this);

        up = new JButton("Up");
        up.addActionListener(al);
        down = new JButton("Down");
        down.addActionListener(al);
        reset = new JButton("Reset");
        reset.addActionListener(al);

        jLabel = new JLabel(this.cm.getValue()+"",SwingConstants.CENTER);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(up,BorderLayout.WEST);
        jPanel.add(down,BorderLayout.EAST);
        jPanel.add(reset,BorderLayout.SOUTH);
        jPanel.add(jLabel,BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);
        this.setResizable(false);
    }

    public void increase() {
        this.cm.increase();
        this.jLabel.setText(this.cm.getValue()+"");
    }

    public void decrease() {
        this.cm.decrease();
        this.jLabel.setText(this.cm.getValue()+"");
    }

    public void reset() {
        this.cm.reset();
        this.jLabel.setText(this.cm.getValue()+"");
    }
}
