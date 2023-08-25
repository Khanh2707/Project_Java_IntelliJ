package BlockThread;

public class Main {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        System.out.println(t1.getState());
        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        Thread1 t2 = new Thread1();
        System.out.println(t2.getState());
        t2.start();
        System.out.println("t1: " +t1.getState());
        System.out.println("t2: " +t2.getState());
    }
}
