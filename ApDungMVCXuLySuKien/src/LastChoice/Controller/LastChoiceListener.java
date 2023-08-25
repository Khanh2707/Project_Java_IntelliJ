package LastChoice.Controller;

import LastChoice.View.LastChoiceView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastChoiceListener implements ActionListener {
    private LastChoiceView lcv;
    public LastChoiceListener(LastChoiceView lcv) {
        this.lcv = lcv;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        System.out.println("Bạn đã nhấn nút: "+src);

        if (src.equals("1")) {
            this.lcv.choice1();
        } else if (src.equals("2")) {
            this.lcv.choice2();
        } else if (src.equals("3")) {
            this.lcv.choice3();
        } else if (src.equals("4")) {
            this.lcv.choice4();
        }
    }
}
