package inheritance.interfaces.devicezx;

public class HallRoomLight implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Lights in hall are ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights in hall are OFF");
    }
}
