package inheritance.interfaces.devicezx;

public class TV implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }

    //default method overridden
    @Override
    public void emergencyShutdown() {
        System.out.println("Due to an emergency TV is shutting down\n");
    }

}