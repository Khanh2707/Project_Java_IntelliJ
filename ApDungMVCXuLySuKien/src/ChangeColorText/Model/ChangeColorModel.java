package ChangeColorText.Model;

import java.awt.*;

public class ChangeColorModel {
    // màu chữ
    private Color foreground;

    // màu nền
    private Color background;

    // tô màu viền (boolean)
    private boolean opaque;

    public ChangeColorModel() {
        this.foreground = Color.BLACK;
        this.background = Color.WHITE;
        this.opaque = true;
    }

    public void setForeground(Color foreground) {
        this.foreground = foreground;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }

    public Color getForeground() {
        return foreground;
    }

    public Color getBackground() {
        return background;
    }

    public boolean isOpaque() {
        return opaque;
    }
}
