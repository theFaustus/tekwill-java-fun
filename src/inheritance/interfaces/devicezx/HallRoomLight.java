package inheritance.interfaces.devicezx;

public class HallRoomLight extends Device implements SmartDevice {
    public HallRoomLight(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void turnOn() {
        System.out.println("Lights in hall are ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights in hall are OFF");
    }

    @Override
    public String toString() {
        return "HallRoomLight{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
