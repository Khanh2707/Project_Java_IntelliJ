package Count.Controller;

import Count.View.CountView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountListen implements ActionListener {
    private CountView cv;
    public CountListen(CountView cv) {
        this.cv = cv;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        System.out.println("Bạn đã nhấn nút: "+src);

        if (src.equals("Up")) {
            this.cv.increase();
        }
        else if (src.equals("Down")) {
            this.cv.decrease();
        }
        else if (src.equals("Reset")) {
            this.cv.reset();
        }
    }
}
