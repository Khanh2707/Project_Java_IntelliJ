package Mouse.Model_Mouse;

public class Model_Mouse {
    private int x, y;
    private int count;
    private String check;

    public Model_Mouse() {
        this.x = 0;
        this.y = 0;
        this.count = 0;
        this.check = "no";
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getCount() {
        return count;
    }

    public String getCheck() {
        return check;
    }

    public void addClick() {
        ++this.count;
    }

    public void enter() {
        this.check = "Yes";
    }

    public void exit() {
        this.check = "No";
    }
}
