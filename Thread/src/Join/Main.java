package Join;

public class Main {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("Xuân");
        ThreadDemo t2 = new ThreadDemo("Hạ");
        ThreadDemo t3 = new ThreadDemo("Thu");
        ThreadDemo t4 = new ThreadDemo("Đông");
        t1.start();
        t2.start();
        try {
            // join ko đối số là thực hiện xong hẳn rồi thằng khác thực hiện
            // join có đối số là thực hiện trong ... giây
            t1.join();
            t2.join();
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        t3.start();
        t4.start();
    }
}
