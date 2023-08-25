package DeamonThread;

public class Main extends Thread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("t1");
        Thread2 t2 = new Thread2("t2");
        Deamon deamon = new Deamon();
        deamon.setDaemon(true);
        t1.start();
        t2.start();
        deamon.start();
    }
}
