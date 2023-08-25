package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Thread1 extends Thread {
    Data d;

    public Thread1(Data d) {
        this.d = d;
    }

    public void run() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\num.txt"));
            synchronized (d) {
                System.out.println("t1");
                String line = null;
                while ((line = br.readLine()) != null) {
                    int num = Integer.parseInt(line.trim());
                    d.setNum(num);
                    System.out.println("Num: "+num);
                    if (num % 2 == 0) {
                        d.setIndex(2);
                    } else {
                        d.setIndex(3);
                    }
                    d.notifyAll();

                    d.wait();
                }
                d.setCheck(false);
                br.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("T1 stop");
        synchronized (d) {
            d.notifyAll();
            stop();
        }
    }
}
