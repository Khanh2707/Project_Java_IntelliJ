package DeamonThread;

public class Thread2 extends Thread {
    public Thread2(String name) {
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
