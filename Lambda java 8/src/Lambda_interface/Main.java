package Lambda_interface;

public class Main{
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";

        StringFormat("Khánh", exclaim);
    }

    public static void StringFormat(String s, StringFunction format) {
        String res = format.run(s);
        System.out.println(res);
    }
}