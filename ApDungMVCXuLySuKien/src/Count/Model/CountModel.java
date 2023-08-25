package Count.Model;

public class CountModel {
    private int value;
    public CountModel() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increase() {
        ++this.value;
    }

    public void decrease() {
        if (this.value > 0)
            --this.value;
    }

    public void reset() {
        this.value = 0;
    }

}
