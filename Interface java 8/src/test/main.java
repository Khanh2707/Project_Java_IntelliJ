package test;

public class main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());

        System.out.println(Car.speed + " " + Car.getName());
    }
}
