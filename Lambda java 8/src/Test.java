import java.util.ArrayList;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.forEach((o) -> {System.out.println(o);});

        Consumer<Integer> fore = (o) -> {System.out.println(o);};
        number.forEach(fore);

        for (Integer o : number) {
            System.out.println(o);
        }
    }
}
