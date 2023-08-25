package TextRun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextRun s = new TextRun();
        Thread t = new Thread(s);
        t.start();
        Scanner sc = new Scanner(System.in);
        String in = null;
        while (sc.hasNext() && !(in = sc.next()).equalsIgnoreCase("e")) {
            if (in.equals("s")) {
                t.suspend();
            }
            else {
                t.resume();
            }
        }
        t.stop();
        sc.close();
    }
}
