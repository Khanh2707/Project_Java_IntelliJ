package test;

public interface Vehicle {
    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn() {
        return "turning the vehicle alarm on";
    }

    default String turnAlarmOff() {
        return "turning the vehicle alarm off";
    }
}
