package Addition;

public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        Input i = new Input(d);
        Output o = new Output(d);
        i.start();
        o.start();
    }
}
