package hw.oopTask.interfaces;

public class Main {
    public static void main(String[] args) {
        Conductor conductor = new Conductor();
        Driver driver = new Driver();
        Person person = new Person();
        Bus bus = new Bus();
        bus.addPassenger(driver);
        bus.showLeftSeat();
        for (int i = 0; i < 20; i++){
            bus.addPassenger(person);
        }
        bus.showLeftSeat();
    }
}
