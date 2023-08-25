package Join;

public class ThreadDemo extends Thread {
    public ThreadDemo(String name) {
        super(name);
    }

    public void run() {
        System.out.println(this.getName()+" Start");
        int i = 0;
        while (i < 7) {
            System.out.println(this.getName()+i);
            i++;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(this.getName()+" End");
    }

}
