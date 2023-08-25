package Menu.Controller;

import Menu.View.Menu_View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Listener implements ActionListener {
    private Menu_View menuView;

    public Menu_Listener(Menu_View menuView) {
        this.menuView = menuView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();

        if (button.equals("Exit")) {
            System.exit(0);
        } else if (button.equals("Toolbar")) {
            AbstractButton checkBox = (AbstractButton) e.getSource();
            boolean check = checkBox.getModel().isSelected();
            if (check) {
                this.menuView.enableJToolbar();
            } else {
                this.menuView.disableJToolbar();
            }
        } else {
            this.menuView.setTextJLabel("Bạn vừa click " +button);
        }
    }
}
