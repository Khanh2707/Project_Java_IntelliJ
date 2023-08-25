package LastChoice.View;

import LastChoice.Controller.LastChoiceListener;
import LastChoice.Model.LastChoiceModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LastChoiceView extends JFrame {
    private LastChoiceModel lcm;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;

    private JLabel jLabel;

    public LastChoiceView() {
        this.lcm = new LastChoiceModel();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Last Choice");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        Font font = new Font("Arial",Font.BOLD,30);
        ActionListener al = new LastChoiceListener(this);

        one = new JButton("1");
        one.setFont(font);
        one.addActionListener(al);
        two = new JButton("2");
        two.setFont(font);
        two.addActionListener(al);
        three = new JButton("3");
        three.setFont(font);
        three.addActionListener(al);
        four = new JButton("4");
        four.setFont(font);
        four.addActionListener(al);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2,2));
        jPanel.add(one);
        jPanel.add(two);
        jPanel.add(three);
        jPanel.add(four);

        JPanel jPanel_footer = new JPanel();
        jLabel = new JLabel("-------");
        jLabel.setFont(font);
        jPanel_footer.add(jLabel);

        this.setLayout(new BorderLayout());
        this.add(jPanel,BorderLayout.CENTER);
        this.add(jPanel_footer,BorderLayout.SOUTH);
    }

    public void choice1() {
        this.lcm.setValue1();
        this.jLabel.setText("Last choice: "+this.lcm.getValue());
    }

    public void choice2() {
        this.lcm.setValue2();
        this.jLabel.setText("Last choice: "+this.lcm.getValue());
    }

    public void choice3() {
        this.lcm.setValue3();
        this.jLabel.setText("Last choice: "+this.lcm.getValue());
    }

    public void choice4() {
        this.lcm.setValue4();
        this.jLabel.setText("Last choice: "+this.lcm.getValue());
    }
}
