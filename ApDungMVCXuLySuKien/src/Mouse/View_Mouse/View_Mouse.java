package Mouse.View_Mouse;

import Mouse.Controller_Mouse.Listener_Mouse;
import Mouse.Model_Mouse.Model_Mouse;

import javax.swing.*;
import java.awt.*;

public class View_Mouse extends JFrame {
    private Model_Mouse model_mouse;
    private JPanel jPanel_mouse;
    private JLabel jLabel_x;
    private JLabel jLabel_y;
    private JLabel jLabel_position;
    private JLabel jLabel_count;
    private JLabel jLabel_count_value;
    private JLabel jLabel_empty1;
    private JLabel jLabel_check_in;
    private JLabel jLabel_check_in_value;
    private JLabel jLabel_empty2;

    public View_Mouse() throws HeadlessException {
        this.model_mouse = new Model_Mouse();
        this.init();
    }

    private void init() {
        this.setSize(1100,500);
        this.setTitle("Mouse");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Listener_Mouse listenerMouse = new Listener_Mouse(this);

        jPanel_mouse = new JPanel();
        jPanel_mouse.setBackground(Color.CYAN);
        jPanel_mouse.addMouseListener(listenerMouse);
        jPanel_mouse.addMouseMotionListener(listenerMouse);

        JPanel jPanel_info = new JPanel();
        jPanel_info.setLayout(new GridLayout(3,3));

        Font font = new Font("Arial",Font.BOLD,30);

        jLabel_position = new JLabel("Position: ");
        jLabel_position.setFont(font);
        jLabel_x = new JLabel("x = ");
        jLabel_x.setFont(font);
        jLabel_y = new JLabel("y = ");
        jLabel_y.setFont(font);
        jLabel_count = new JLabel("Numbers of click: ");
        jLabel_count.setFont(font);
        jLabel_count_value = new JLabel("n = ");
        jLabel_count_value.setFont(font);
        jLabel_empty1 = new JLabel();
        jLabel_check_in = new JLabel("Mouse is in component: ");
        jLabel_check_in.setFont(font);
        jLabel_check_in_value = new JLabel("no");
        jLabel_check_in_value.setFont(font);
        jLabel_empty2 = new JLabel();

        jPanel_info.add(jLabel_position);
        jPanel_info.add(jLabel_x);
        jPanel_info.add(jLabel_y);
        jPanel_info.add(jLabel_count);
        jPanel_info.add(jLabel_count_value);
        jPanel_info.add(jLabel_empty1);
        jPanel_info.add(jLabel_check_in);
        jPanel_info.add(jLabel_check_in_value);
        jPanel_info.add(jLabel_empty2);

        this.setLayout(new BorderLayout());
        this.add(jPanel_mouse,BorderLayout.CENTER);
        this.add(jPanel_info,BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void addClick() {
        this.model_mouse.addClick();
        this.jLabel_count_value.setText("n = "+this.model_mouse.getCount());
    }

    public void enter() {
        this.model_mouse.enter();
        this.jLabel_check_in_value.setText(this.model_mouse.getCheck());
    }

    public void exit() {
        this.model_mouse.exit();
        this.jLabel_check_in_value.setText(this.model_mouse.getCheck());
    }

    public void update(int x, int y) {
        this.model_mouse.setX(x);
        this.model_mouse.setY(y);
        this.jLabel_x.setText(this.model_mouse.getX()+"");
        this.jLabel_y.setText(this.model_mouse.getY()+"");
    }
}
