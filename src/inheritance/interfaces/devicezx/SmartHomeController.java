package inheritance.interfaces.devicezx;

public class SmartHomeController {
    HallRoomLight hallRoomLight;
    MusicSpeaker musicSpeaker;
    TV tv;

    public SmartHomeController(HallRoomLight hallRoomLight, MusicSpeaker musicSpeaker, TV tv) {
        this.hallRoomLight = hallRoomLight;
        this.musicSpeaker = musicSpeaker;
        this.tv = tv;
    }

    public void emergencyPowerOff() {
        //TODO: Talk about something

        hallRoomLight.emergencyShutdown();
        musicSpeaker.emergencyShutdown();
        tv.emergencyShutdown();
    }

    public void updateDevices() {
        SmartDevice.update();
        //hallRoomLight.update(); won`t compile with instance call
    }

    public void turnOnAllDevices() {
        hallRoomLight.turnOn();
        musicSpeaker.turnOn();
        tv.turnOn();
    }

    public void turnOffAllDevices() {
        hallRoomLight.turnOff();
        musicSpeaker.turnOff();
        tv.turnOff();
    }

    //TODO: Talk about changing access of the implemented method
}
