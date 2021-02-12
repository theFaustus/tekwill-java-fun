package inheritance.interfaces.devicezx;

public class MusicSpeaker extends Device implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Speaker is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Speaker is OFF");
    }

    @Override
    public String toString() {
        return "MusicSpeaker{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
