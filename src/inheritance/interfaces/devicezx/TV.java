package inheritance.interfaces.devicezx;

public class TV extends Device implements SmartDevice {
    private String serialNumber = "789456321-56-5-65";
    private int volume = 15;

    public TV(int volume) {
        super();
        this.volume = volume;
    }

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
        System.out.println("Due to an emergency TV is shutting down");
    }

    public void changeVolume(int volume) {
        System.out.println("Changing TV volume to " + volume);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "TV{" +
                "serialNumber='" + super.serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", serialNumber='" + this.serialNumber + '\'' +
                ", volume=" + volume +
                '}';
    }
}