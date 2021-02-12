package inheritance.interfaces.devicezx;

public class Radio extends Device implements SmartDevice {
    private int volume;

    public Radio(String serialNumber, String brand, int volume) {
        super(serialNumber, brand);
        this.volume = volume;
    }

    @Override
    public void turnOn() {
        System.out.println("Radio is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is OFF");
    }

    public void changeVolume(int volume) {
        System.out.println("Changing Radio volume to " + volume);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", volume=" + volume +
                '}';
    }

//    @Override
//    public void foo(int a, int b){ it is not an overriding, pay attention - overloading
//
//    }
}
