package inheritance.interfaces.devicezx;

import java.util.ArrayList;
import java.util.Arrays;

public class SmartHomeDemo {
    public static void main(String[] args) {
        HallRoomLight hallRoomLight = new HallRoomLight("7897924-45646");
        MusicSpeaker musicSpeaker = new MusicSpeaker();
        TV tv = new TV(12); //via its own class
//        //interface based - allowed
//        tv.turnOn();
//        tv.emergencyShutdown();
//        tv.turnOff();
//        //parent class based - allowed
//        System.out.println(tv.serialNumber);
//        //own class based - allowed
//        tv.changeVolume(60);

//        Device tv = new TV(); // via its parent
//        //interface based - forbidden
//        tv.turnOn();
//        tv.emergencyShutdown();
//        tv.turnOff();
//        //parent class based - allowed
//        System.out.println(tv.serialNumber);
//        //own class based - forbidden
//        tv.changeVolume(60);

//        SmartDevice tv = new TV(); //via its interface
//        //interface based - allowed
//        tv.turnOn();
//        tv.emergencyShutdown();
//        tv.turnOff();
//        //parent class based - forbidden
//        System.out.println(tv.serialNumber);
//        //own class based - forbidden
//        tv.changeVolume(60);


        ArrayList<SmartDevice> smartDevices = new ArrayList<>(Arrays.asList(tv, hallRoomLight));

        SmartHomeController smartHomeController = new SmartHomeController(smartDevices);
        smartHomeController.addSmartDevice(new Radio("7894654-4654325676", "JBL", 25));

        smartHomeController.turnOnAllDevices();
        smartHomeController.turnOffAllDevices();
        smartHomeController.turnOnAllDevices();
        smartHomeController.emergencyPowerOff();

        smartHomeController.updateDevices();
        smartHomeController.changeTvVolume(45);

        for (SmartDevice smartDevice : smartHomeController.getSmartDeviceList()) {
            System.out.println(smartDevice);
        }

    }
}
