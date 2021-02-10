package inheritance.interfaces.devicezx;

public class MusicSpeaker implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Speaker is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Speaker is OFF");
    }
}
