package Bank;

public class NapTien extends Thread {
    String name;
    int value;
    Account a;

    public NapTien(String name, int value, Account a) {
        this.name = name;
        this.value = value;
        this.a = a;
    }

    public void run() {
        a.deposite(name,value);
    }
}
