package ChangeColorText.View;

import ChangeColorText.Controller.ChangeColorListener;
import ChangeColorText.Model.ChangeColorModel;

import javax.swing.*;
import java.awt.*;

public class ChangeColorView extends JFrame {
    private ChangeColorModel ccm;

    //phải khai báo JLabel ở ngoài
    private JLabel jLabel;
    private JButton text_red;
    private JButton text_yellow;
    private JButton text_green;
    private JButton background_red;
    private JButton background_yellow;
    private JButton background_green;

    public ChangeColorView() {
        this.ccm = new ChangeColorModel();
        this.init();
    }

    public void init() {
        this.setTitle("Change color");
        this.setSize(1100,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        jLabel = new JLabel("Text",SwingConstants.CENTER);
        ChangeColorListener ccl = new ChangeColorListener(this);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2,3,10,10));

        Font font = new Font("Arial",Font.BOLD,30);
        Font font_jLabel = new Font("Arial",Font.BOLD,70);
        jLabel.setFont(font_jLabel);

        text_red = new JButton("Text_Red");
        text_red.setFont(font);
        text_red.setForeground(Color.RED);
        text_red.setBackground(Color.BLACK);
        text_red.addActionListener(ccl);

        text_yellow = new JButton("Text_Yellow");
        text_yellow.setFont(font);
        text_yellow.setForeground(Color.YELLOW);
        text_yellow.setBackground(Color.BLACK);
        text_yellow.addActionListener(ccl);

        text_green = new JButton("Text_Green");
        text_green.setFont(font);
        text_green.setForeground(Color.GREEN);
        text_green.setBackground(Color.BLACK);
        text_green.addActionListener(ccl);

        background_red = new JButton("Background_Red");
        background_red.setFont(font);
        background_red.setBackground(Color.RED);
        //background_red.setOpaque(true);
        background_red.addActionListener(ccl);

        background_yellow = new JButton("Background_Yellow");
        background_yellow.setFont(font);
        background_yellow.setBackground(Color.YELLOW);
        //background_yellow.setOpaque(true);
        background_yellow.addActionListener(ccl);

        background_green = new JButton("Background_Green");
        background_green.setFont(font);
        background_green.setBackground(Color.GREEN);
        //background_green.setOpaque(true);
        background_green.addActionListener(ccl);

        jPanel.add(text_red);
        jPanel.add(text_yellow);
        jPanel.add(text_green);
        jPanel.add(background_red);
        jPanel.add(background_yellow);
        jPanel.add(background_green);

        this.setLayout(new BorderLayout());
        this.add(jLabel,BorderLayout.NORTH);
        this.add(jPanel,BorderLayout.CENTER);

        this.setVisible(true);
    }

    public void changeColorText(Color color) {
        this.jLabel.setForeground(color);
    }

    public void changeColorBackground(Color color) {
        this.jLabel.setBackground(color);
        jLabel.setOpaque(true);
    }
}
