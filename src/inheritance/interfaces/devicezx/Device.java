package inheritance.interfaces.devicezx;

public abstract class Device {
    public String serialNumber;
    public String brand;

    public Device(String serialNumber) {
        this.serialNumber = serialNumber;
        this.brand = "n/a";
    }

    public Device(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    public Device() {
        this.serialNumber = "n/a";
        this.brand = "n/a";
    }

    public void foo() {

    }
}
