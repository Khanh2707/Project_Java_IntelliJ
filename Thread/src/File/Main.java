package File;

public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        Thread1 t1 = new Thread1(d);
        Thread2 t2 = new Thread2(d);
        Thread3 t3 = new Thread3(d);

        System.out.println("t1: "+t1.getState());
        System.out.println("t2: "+t2.getState());
        System.out.println("t3: "+t3.getState());
        t1.start();
        System.out.println("t1: "+t1.getState());
        System.out.println("t2: "+t2.getState());
        System.out.println("t3: "+t3.getState());
        t2.start();
        System.out.println("t1: "+t1.getState());
        System.out.println("t2: "+t2.getState());
        System.out.println("t3: "+t3.getState());
        t3.start();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("t1: " + t1.getState());
            System.out.println("t2: " + t2.getState());
            System.out.println("t3: " + t3.getState());
        }
    }
}
