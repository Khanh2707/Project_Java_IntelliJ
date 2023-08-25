package TextRun;

public class TextRun implements Runnable {
    public boolean running;

    public TextRun() {
        running = true;
    }

    public void Stop() {
        running = false;
    }

    @Override
    public void run() {
        String line = "CAO ĐẲNG CÔNG NGHỆ BÁCH KHOA HÀ NỘI ";
        while (running) {
            line = line.charAt(line.length()-1)+line.substring(0,line.length()-1);
            System.out.println(line);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
