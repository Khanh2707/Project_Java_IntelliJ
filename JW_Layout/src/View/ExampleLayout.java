package View;

import javax.swing.*;
import java.awt.*;

public class ExampleLayout extends JFrame {
    public ExampleLayout() {
        this.setTitle("Example layout");
        this.setSize(700,500);
        this.setLocationRelativeTo(null);

        //FlowLayout
//        FlowLayout fl1 = new FlowLayout();
//        this.setLayout(fl1);
//        FlowLayout fl2 = new FlowLayout(FlowLayout.LEFT);
//        this.setLayout(fl2);
//        FlowLayout fl3 = new FlowLayout(FlowLayout.CENTER, 30, 30);
//        this.setLayout(fl3);
//        JButton jb_1 = new JButton("1");
//        this.add(jb_1);

        //GridLayout
//        GridLayout gl1 = new GridLayout();
//        GridLayout gl2 = new GridLayout(3,3);
//        GridLayout gl3 = new GridLayout(3,3,20,20);
//        this.setLayout(gl2);
//
//        for (int i = 0; i < 9; i++) {
//            JButton jb_1 = new JButton(i+"");
//            this.add(jb_1);
//        }

        //BorderLayout
        BorderLayout bl1 = new BorderLayout();
        BorderLayout bl2 = new BorderLayout(50,50);

        this.setLayout(bl2);

        JButton jb_1 = new JButton("1");
        JButton jb_2 = new JButton("2");
        JButton jb_3 = new JButton("3");
        JButton jb_4 = new JButton("4");
        JButton jb_5 = new JButton("5");

        this.add(jb_1,BorderLayout.NORTH);
        this.add(jb_2,BorderLayout.SOUTH);
        this.add(jb_3,BorderLayout.EAST);
        this.add(jb_4,BorderLayout.WEST);
        this.add(jb_5,BorderLayout.CENTER);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

//    public static void main(String[] args) {
//        new ExampleLayout();
//    }
}
