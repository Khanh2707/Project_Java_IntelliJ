package JTextArea.View;

import JTextArea.Controller.JTA_Listener;
import JTextArea.Model.JTA_Model;

import javax.swing.*;
import java.awt.*;

public class JTA_View extends JFrame {
    private JTA_Model jta_model;
    JTextArea jTextArea_vanBan;
    JTextField jTextField_tuKhoa;
    JLabel jLabel_ketQua;

    public JTA_View() throws HeadlessException {
        this.jta_model = new JTA_Model();
        this.init();
    }

    public void init() {
        this.setSize(500,500);
        this.setTitle("Search");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial",Font.BOLD,30);

        JLabel jLabel_vanBan = new JLabel("Văn bản");
        jLabel_vanBan.setFont(font);
        jTextArea_vanBan = new JTextArea(100,100);
        jTextArea_vanBan.setFont(font);

        JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //jScrollPane.setViewportView(jTextArea_vanBan);

        JLabel jLabel_tuKhoa = new JLabel("Từ khóa");
        jLabel_tuKhoa.setFont(font);
        jTextField_tuKhoa = new JTextField();
        jTextField_tuKhoa.setFont(font);

        JTA_Listener jtaListener = new JTA_Listener(this);

        JButton jButton_thongKe = new JButton("Kết quả");
        jButton_thongKe.setFont(font);
        jButton_thongKe.addActionListener(jtaListener);
        jLabel_ketQua = new JLabel("...");
        jLabel_ketQua.setFont(font);
        jLabel_ketQua.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2,2,10,10));
        jPanel_footer.add(jLabel_tuKhoa);
        jPanel_footer.add(jTextField_tuKhoa);
        jPanel_footer.add(jButton_thongKe);
        jPanel_footer.add(jLabel_ketQua);

        this.setLayout(new BorderLayout());
        this.add(jLabel_vanBan,BorderLayout.NORTH);
        this.add(jScrollPane,BorderLayout.CENTER);
        this.add(jPanel_footer,BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void TimKiem() {
        this.jta_model.setVanBan(jTextArea_vanBan.getText());
        this.jta_model.setTuKhoa(jTextField_tuKhoa.getText());
        this.jta_model.timKiem();
        this.jLabel_ketQua.setText(this.jta_model.getKetQua());
    }
}
