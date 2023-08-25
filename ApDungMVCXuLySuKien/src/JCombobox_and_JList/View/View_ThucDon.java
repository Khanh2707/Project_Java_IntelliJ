package JCombobox_and_JList.View;

import JCombobox_and_JList.Controller.Listener_ThucDon;
import JCombobox_and_JList.Model.Model_ThucDon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class View_ThucDon extends JFrame {
    public Model_ThucDon modelThucDon;
    public JRadioButton jRadioButton_Com;
    public JRadioButton jRadioButton_Pho;
    public JRadioButton jRadioButton_BanhMy;
    public JCheckBox jCheckBox_TraSua;
    public JCheckBox jCheckBox_CocaCola;
    public JCheckBox jCheckBox_Pepsi;
    public JCheckBox jCheckBox_7up;
    public ButtonGroup buttonGroup_MonChinh;
    public ArrayList<JCheckBox> list_buttonGroup_MonPhu;
    public JLabel jLabel_ThongTinThanhToan;
    public JComboBox<String> jComboBox_MonChinh;
    public JList<String> jList_MonPhu;

    public View_ThucDon() {
        this.modelThucDon = new Model_ThucDon();
        this.init();
    }

    private void init() {
        this.setSize(1000,500);
        this.setTitle("Thuc don");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JLabel jLabel = new JLabel("Thực đơn nhà hàng TpKhanhs");

        JPanel jPanel_TieuDe = new JPanel();
        jPanel_TieuDe.add(jLabel);
        this.add(jPanel_TieuDe,BorderLayout.NORTH);


        JPanel jPanel_MonChinh = new JPanel();
        jPanel_MonChinh.setLayout(new FlowLayout());
        String[] cacMonChinh = new String[] {"CƠM", "PHỞ", "BÁNH MỲ"};
        jComboBox_MonChinh = new JComboBox<>(cacMonChinh);
        jPanel_MonChinh.add(jComboBox_MonChinh);


        JPanel jPanel_MonPhu = new JPanel();
        jPanel_MonPhu.setLayout(new GridLayout(2,2));
        String[] cacMonPhu = new String[] {"TRÀ SỮA", "COCACOLA", "PEPSI", "7 UP"};
        jList_MonPhu = new JList<>(cacMonPhu);
        jPanel_MonPhu.add(jList_MonPhu);


        JPanel jPanel_LuaChon = new JPanel();
        jPanel_LuaChon.setLayout(new BorderLayout());
        jPanel_LuaChon.add(jPanel_MonChinh, BorderLayout.NORTH);
        jPanel_LuaChon.add(jPanel_MonPhu, BorderLayout.CENTER);

        Listener_ThucDon listenerThucDon = new Listener_ThucDon(this);

        JPanel jPanel_ThanhToan = new JPanel();
        jPanel_ThanhToan.setLayout(new GridLayout(1,2));
        jLabel_ThongTinThanhToan = new JLabel();
        JButton jButton_ThanhToan = new JButton("THANH TOÁN");
        jButton_ThanhToan.addActionListener(listenerThucDon);
        jPanel_ThanhToan.add(jLabel_ThongTinThanhToan);
        jPanel_ThanhToan.add(jButton_ThanhToan);

        this.add(jPanel_LuaChon,BorderLayout.CENTER);
        this.add(jPanel_ThanhToan,BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void hienThiKetQua() {
        String ketQua = "Món chính: " +this.modelThucDon.getLucChonMonChinh() + " - Món phụ: " +this.modelThucDon.getLucChonMonPhu() + "Tổng tiền: " +this.modelThucDon.getTongTien();
        this.jLabel_ThongTinThanhToan.setText(ketQua);
    }
}
