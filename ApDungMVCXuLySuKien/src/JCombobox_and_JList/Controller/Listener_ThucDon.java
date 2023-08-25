package JCombobox_and_JList.Controller;

import JCombobox_and_JList.View.View_ThucDon;

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
        String monChinh = viewThucDon.jComboBox_MonChinh.getSelectedItem().toString();

        String monPhu = "";
        Object[] luaChonMonPhu = viewThucDon.jList_MonPhu.getSelectedValues();
        for (Object o : luaChonMonPhu) {
                monPhu = monPhu + o.toString() + ", ";
        }

        viewThucDon.modelThucDon.setLucChonMonChinh(monChinh);
        viewThucDon.modelThucDon.setLucChonMonPhu(monPhu);
        viewThucDon.modelThucDon.tinhTongTien();
        viewThucDon.hienThiKetQua();

        String soTienChuoi = JOptionPane.showInputDialog(viewThucDon,
                                                    viewThucDon.jLabel_ThongTinThanhToan.getText()
                                                    +"\nNhập số tiền: ",
                                                    "Thông báo",
                                                    JOptionPane.PLAIN_MESSAGE);

        try {
            double soTien = Double.valueOf(soTienChuoi);
            JOptionPane.showMessageDialog(viewThucDon,"ĐẶT MÓN THÀNH CÔNG!\nTiền thừa: " +(soTien - viewThucDon.modelThucDon.getTongTien()),"Thông báo!",JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e1) {
            JOptionPane.showMessageDialog(viewThucDon,"Nhập dữ liệu sai!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
