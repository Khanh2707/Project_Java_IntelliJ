package Mouse.Controller_Mouse;

import Mouse.View_Mouse.View_Mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Listener_Mouse implements MouseListener, MouseMotionListener {
    private View_Mouse viewMouse;

    public Listener_Mouse(View_Mouse viewMouse) {
        this.viewMouse = viewMouse;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.viewMouse.addClick();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.viewMouse.enter();
        int x = e.getX();
        int y = e.getY();
        this.viewMouse.update(x,y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.viewMouse.exit();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        this.viewMouse.update(x,y);
    }
}
