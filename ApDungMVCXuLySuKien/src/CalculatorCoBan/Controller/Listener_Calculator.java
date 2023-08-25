package CalculatorCoBan.Controller;

import CalculatorCoBan.View.ViewCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener_Calculator implements ActionListener {
    ViewCalculator vc;
    public Listener_Calculator(ViewCalculator vc) {
        this.vc = vc;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("+")) {
            this.vc.plus();
        } else if (button.equals("-")) {
            this.vc.minus();
        } else if (button.equals("*")) {
            this.vc.times();
        } else if (button.equals("/")) {
            this.vc.into();
        } else if (button.equals("x^y")) {
            this.vc.pow();
        } else if (button.equals("%")) {
            this.vc.mod();
        }
    }
}
