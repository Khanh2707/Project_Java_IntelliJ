package test;

public class Car implements Vehicle{
    public static int speed = 7000;

    public static String getName() {
        return "TPK";
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String speedUp() {
        return null;
    }

    @Override
    public String slowDown() {
        return null;
    }
}
