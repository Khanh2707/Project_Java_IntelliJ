package Addition;

import java.util.Vector;

public class Data {
    Vector<Integer> v;
    private int index;
    private boolean running;

    public Data() {
        v = new Vector<>();
        running = true;
        index = 1;
    }

    public void add(int x) {
        v.add(x);
    }

    public int get() {
        return v.remove(0);
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getIndex() {
        return index;
    }

    public boolean isRunning() {
        return running;
    }
}
