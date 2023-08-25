package Menu.Controller;

import Menu.View.Menu_View;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Menu_Mouse_Listener implements MouseListener {
    Menu_View menuView_Mouse;

    public Menu_Mouse_Listener(Menu_View menuView_Mouse) {
        this.menuView_Mouse = menuView_Mouse;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.isPopupTrigger()) {
            this.menuView_Mouse.jPopupMenu.show(e.getComponent(),e.getX(),e.getY());
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
            this.menuView_Mouse.jPopupMenu.show(e.getComponent(),e.getX(),e.getY());
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
