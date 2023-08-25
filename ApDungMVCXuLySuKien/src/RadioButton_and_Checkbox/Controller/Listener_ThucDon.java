package RadioButton_and_Checkbox.Controller;

import RadioButton_and_Checkbox.View.View_ThucDon;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class Listener_ThucDon implements ActionListener {
    private View_ThucDon viewThucDon;

    public Listener_ThucDon(View_ThucDon viewThucDon) {
        this.viewThucDon = viewThucDon;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String monChinh = "";
        Enumeration<AbstractButton> button_monChinh = viewThucDon.buttonGroup_MonChinh.getElements();
        while (button_monChinh.hasMoreElements()) {
            AbstractButton button = button_monChinh.nextElement();
            if (button.isSelected()) {
                monChinh = button.getText();
            }
        }

        String monPhu = "";
        for (AbstractButton button : viewThucDon.list_buttonGroup_MonPhu) {
            if (button.isSelected()) {
                monPhu = monPhu + button.getText() + ", ";
            }
        }

        viewThucDon.modelThucDon.setLucChonMonChinh(monChinh);
        viewThucDon.modelThucDon.setLucChonMonPhu(monPhu);
        viewThucDon.modelThucDon.tinhTongTien();
        viewThucDon.hienThiKetQua();
    }
}
