package Bank;

public class Main {
    public static void main(String[] args) {
        Account a = new Account();
        System.out.println("\33[31mTiền tài khoản: "+a.balance);
        RutTien h = new RutTien("Husband",3500,a);
        h.start();
        NapTien w = new NapTien("Wife",1000,a);
        w.start();
    }
}
