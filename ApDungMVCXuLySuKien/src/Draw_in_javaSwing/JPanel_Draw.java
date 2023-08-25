package Draw_in_javaSwing;

import javax.swing.*;
import java.awt.*;

public class JPanel_Draw extends JPanel {
    public JPanel_Draw() {
        this.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawLine(15,15,50,150);
        //allbits, abort, width, height
        g.drawOval(255,255,50,50);
        g.drawRect(45,150,30,90);

        g.setColor(Color.PINK);
        g.fillOval(400,300,50,50);

        g.setColor(Color.GRAY);
        g.fillRect(100,100,150,150);
    }
}
