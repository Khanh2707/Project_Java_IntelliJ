package File;

public class Data {
    private int index, num;
    private boolean check;

    public Data() {
        index = 1;
        check = true;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public int getIndex() {
        return index;
    }

    public int getNum() {
        return num;
    }

    public boolean isCheck() {
        return check;
    }
}
