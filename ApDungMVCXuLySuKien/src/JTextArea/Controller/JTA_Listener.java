package JTextArea.Controller;

import JTextArea.View.JTA_View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTA_Listener implements ActionListener {
    private JTA_View jtaView;

    public JTA_Listener(JTA_View jtaView) {
        this.jtaView = jtaView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        System.out.println("Vừa nhấn: "+src);
        this.jtaView.TimKiem();
    }
}
