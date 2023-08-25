package DeamonThread;

public class Thread1 extends Thread {
    public Thread1(String name) {
        super(name);
    }

    public void run() {
        System.out.println(this.getName()+" start");
        for (int i = 0; i < 7; i++) {
            System.out.println(this.getName()+" "+i);
        }
        System.out.println(this.getName()+" stop");
    }
}
