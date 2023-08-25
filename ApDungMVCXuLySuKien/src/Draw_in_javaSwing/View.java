package Draw_in_javaSwing;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    public View() throws HeadlessException {
        this.setSize(500,500);
        this.setTitle("Draw");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel_Draw jPanelDraw = new JPanel_Draw();

        this.setLayout(new BorderLayout());
        this.add(jPanelDraw,BorderLayout.CENTER);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new View();
    }
}
