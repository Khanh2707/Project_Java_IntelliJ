package RadioButton_and_Checkbox.View;

import RadioButton_and_Checkbox.Controller.Listener_ThucDon;
import RadioButton_and_Checkbox.Model.Model_ThucDon;

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
        jPanel_MonChinh.setLayout(new GridLayout(1,3));
        jRadioButton_Com = new JRadioButton("CƠM");
        jRadioButton_Pho = new JRadioButton("PHỞ");
        jRadioButton_BanhMy = new JRadioButton("BÁNH MỲ");

        // ButtonGroup để chỉ chọn được 1 cái
        buttonGroup_MonChinh = new ButtonGroup();
        buttonGroup_MonChinh.add(jRadioButton_Com);
        buttonGroup_MonChinh.add(jRadioButton_Pho);
        buttonGroup_MonChinh.add(jRadioButton_BanhMy);
        jPanel_MonChinh.add(jRadioButton_Com);
        jPanel_MonChinh.add(jRadioButton_Pho);
        jPanel_MonChinh.add(jRadioButton_BanhMy);


        JPanel jPanel_MonPhu = new JPanel();
        jPanel_MonPhu.setLayout(new GridLayout(2,2));
        jCheckBox_TraSua = new JCheckBox("TRÀ SỮA");
        jCheckBox_CocaCola = new JCheckBox("COCACOLA");
        jCheckBox_Pepsi = new JCheckBox("PEPSI");
        jCheckBox_7up = new JCheckBox("7 UP");
        jPanel_MonPhu.add(jCheckBox_TraSua);
        jPanel_MonPhu.add(jCheckBox_CocaCola);
        jPanel_MonPhu.add(jCheckBox_Pepsi);
        jPanel_MonPhu.add(jCheckBox_7up);

        list_buttonGroup_MonPhu = new ArrayList<JCheckBox>();
        list_buttonGroup_MonPhu.add(jCheckBox_TraSua);
        list_buttonGroup_MonPhu.add(jCheckBox_CocaCola);
        list_buttonGroup_MonPhu.add(jCheckBox_Pepsi);
        list_buttonGroup_MonPhu.add(jCheckBox_7up);


        JPanel jPanel_LuaChon = new JPanel();
        jPanel_LuaChon.setLayout(new GridLayout(2,1));
        jPanel_LuaChon.add(jPanel_MonChinh);
        jPanel_LuaChon.add(jPanel_MonPhu);

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
        String ketQua = "Món chính: " +this.modelThucDon.getLucChonMonChinh() + "Món phụ: " +this.modelThucDon.getLucChonMonPhu() + "Tổng tiền: " +this.modelThucDon.getTongTien();
        this.jLabel_ThongTinThanhToan.setText(ketQua);
    }
}
