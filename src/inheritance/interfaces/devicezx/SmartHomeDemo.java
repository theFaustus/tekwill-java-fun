package inheritance.interfaces.devicezx;

public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartHomeController smartHomeController = new SmartHomeController(new HallRoomLight(), new MusicSpeaker(), new TV());

        smartHomeController.turnOnAllDevices();
        smartHomeController.turnOffAllDevices();
        smartHomeController.turnOnAllDevices();
        smartHomeController.emergencyPowerOff();

        smartHomeController.updateDevices();

    }
}
