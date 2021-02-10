package inheritance.interfaces.devicezx;

import java.util.Random;

public interface SmartDevice {
    static boolean update() {
        boolean updatedSuccessfully = new Random().nextInt(15) != 12;
        if (updatedSuccessfully) {
            System.out.println("Device update successfully!");
        } else {
            System.out.println("Device update failed...");
        }
        return updatedSuccessfully;
    }

    public void turnOn();

    public void turnOff();

    default void emergencyShutdown() {
        System.out.println("Due to an emergency device is shutting down");
    }
}
