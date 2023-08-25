package Bank;

public class RutTien extends Thread {
    String name;
    int value;
    Account a;

    public RutTien(String name, int value, Account a) {
        this.name = name;
        this.value = value;
        this.a = a;
    }

    public void run() {
        a.withDraw(name,value);
    }
}
