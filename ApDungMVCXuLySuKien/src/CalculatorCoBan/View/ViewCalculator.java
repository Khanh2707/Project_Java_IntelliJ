package CalculatorCoBan.View;

import CalculatorCoBan.Controller.Listener_Calculator;
import CalculatorCoBan.Model.Model_Calculator;

import javax.swing.*;
import java.awt.*;

public class ViewCalculator extends JFrame {
    private Model_Calculator mc;
    private JTextField jTextField_first;
    private JTextField jTextField_second;
    private JLabel jLabel_answer_value;

    public ViewCalculator() {
        this.mc = new Model_Calculator();
        this.init();
    }

    public void init() {
        this.setTitle("Calculator");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial",Font.BOLD,30);

        JLabel jLabel_first = new JLabel("Value 1");
        jLabel_first.setFont(font);

        JLabel jLabel_second = new JLabel("Value 2");
        jLabel_second.setFont(font);

        JLabel jLabel_answer = new JLabel("Answer");
        jLabel_answer.setFont(font);

        jTextField_first = new JTextField();
        jTextField_first.setFont(font);
        jTextField_second = new JTextField();
        jTextField_second.setFont(font);
        jLabel_answer_value = new JLabel("...");
        jLabel_answer_value.setFont(font);
        jLabel_answer_value.setBackground(Color.WHITE);
        jLabel_answer_value.setOpaque(true);
        jLabel_answer_value.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(3,2,10,10));
        jPanel.add(jLabel_first);
        jPanel.add(jTextField_first);
        jPanel.add(jLabel_second);
        jPanel.add(jTextField_second);
        jPanel.add(jLabel_answer);
        jPanel.add(jLabel_answer_value);

        Listener_Calculator lc = new Listener_Calculator(this);

        JButton plus = new JButton("+");
        plus.setFont(font);
        plus.addActionListener(lc);

        JButton minus = new JButton("-");
        minus.setFont(font);
        minus.addActionListener(lc);

        JButton times = new JButton("*");
        times.setFont(font);
        times.addActionListener(lc);

        JButton into = new JButton("/");
        into.setFont(font);
        into.addActionListener(lc);

        JButton pow = new JButton("x^y");
        pow.setFont(font);
        pow.addActionListener(lc);

        JButton mod = new JButton("%");
        mod.setFont(font);
        mod.addActionListener(lc);

        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(2,3,10,10));
        buttons.add(plus);
        buttons.add(minus);
        buttons.add(times);
        buttons.add(into);
        buttons.add(pow);
        buttons.add(mod);

        this.setLayout(new BorderLayout());
        this.add(jPanel,BorderLayout.CENTER);
        this.add(buttons,BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void plus() {
        double firstValue = Double.valueOf(jTextField_first.getText());
        double secondValue = Double.valueOf(jTextField_second.getText());
        this.mc.setFirstValue(firstValue);
        this.mc.setSecondValue(secondValue);
        this.mc.plus();
        this.jLabel_answer_value.setText(this.mc.getAnswer()+"");
    }

    public void minus() {
        double firstValue = Double.valueOf(jTextField_first.getText());
        double secondValue = Double.valueOf(jTextField_second.getText());
        this.mc.setFirstValue(firstValue);
        this.mc.setSecondValue(secondValue);
        this.mc.minus();
        this.jLabel_answer_value.setText(this.mc.getAnswer()+"");
    }

    public void times() {
        double firstValue = Double.valueOf(jTextField_first.getText());
        double secondValue = Double.valueOf(jTextField_second.getText());
        this.mc.setFirstValue(firstValue);
        this.mc.setSecondValue(secondValue);
        this.mc.times();
        this.jLabel_answer_value.setText(this.mc.getAnswer()+"");
    }

    public void into() {
        double firstValue = Double.valueOf(jTextField_first.getText());
        double secondValue = Double.valueOf(jTextField_second.getText());
        this.mc.setFirstValue(firstValue);
        this.mc.setSecondValue(secondValue);
        this.mc.into();
        this.jLabel_answer_value.setText(this.mc.getAnswer()+"");
    }

    public void pow() {
        double firstValue = Double.valueOf(jTextField_first.getText());
        double secondValue = Double.valueOf(jTextField_second.getText());
        this.mc.setFirstValue(firstValue);
        this.mc.setSecondValue(secondValue);
        this.mc.pow();
        this.jLabel_answer_value.setText(this.mc.getAnswer()+"");
    }

    public void mod() {
        double firstValue = Double.valueOf(jTextField_first.getText());
        double secondValue = Double.valueOf(jTextField_second.getText());
        this.mc.setFirstValue(firstValue);
        this.mc.setSecondValue(secondValue);
        this.mc.mod();
        this.jLabel_answer_value.setText(this.mc.getAnswer()+"");
    }
}
