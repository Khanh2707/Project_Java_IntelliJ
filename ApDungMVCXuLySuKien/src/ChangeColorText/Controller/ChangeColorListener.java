package ChangeColorText.Controller;

import ChangeColorText.View.ChangeColorView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeColorListener implements ActionListener {
    private ChangeColorView ccv;
    public ChangeColorListener(ChangeColorView ccv) {
        this.ccv = ccv;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        System.out.println("Bạn đã nhấn nút: "+src);

        if (src.equals("Text_Red")) {
            this.ccv.changeColorText(Color.RED);
        } else if (src.equals("Text_Yellow")) {
            this.ccv.changeColorText(Color.YELLOW);
        } else if (src.equals("Text_Green")) {
            this.ccv.changeColorText(Color.GREEN);
        } else if (src.equals("Background_Red")) {
            this.ccv.changeColorBackground(Color.RED);
        } else if (src.equals("Background_Yellow")) {
            this.ccv.changeColorBackground(Color.YELLOW);
        } else if (src.equals("Background_Green")) {
            this.ccv.changeColorBackground(Color.GREEN);
        }
    }
}
