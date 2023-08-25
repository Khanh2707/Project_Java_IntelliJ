package test;

public interface Alarm {
    default String turnAlarmOn() {
        return "turning the alarm on";
    }

    default String turnAlarmOff() {
        return "turning the alarm off";
    }
}
