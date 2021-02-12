package inheritance.interfaces.devicezx;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    //    HallRoomLight hallRoomLight;
//    MusicSpeaker musicSpeaker;
//    TV tv;
// won`t talk to them in particular, but rather as smart devices instead
    List<SmartDevice> smartDeviceList = new ArrayList<>();


    public SmartHomeController(List<SmartDevice> smartDevices) {
        this.smartDeviceList = smartDevices;
    }

    public void addSmartDevice(SmartDevice smartDevice) {
        smartDeviceList.add(smartDevice);
    }

    public void emergencyPowerOff() {
        for (SmartDevice smartDevice : smartDeviceList) {
            smartDevice.emergencyShutdown();
        }
    }

    public void updateDevices() {
        SmartDevice.update();
        //hallRoomLight.update(); won`t compile with instance call
    }

    public void turnOnAllDevices() {
        for (SmartDevice smartDevice : smartDeviceList) {
            smartDevice.turnOn();
        }
    }

    public void turnOffAllDevices() {
        for (SmartDevice smartDevice : smartDeviceList) {
            smartDevice.turnOff();
        }
    }

    public void changeTvVolume(int volume) {
        for (SmartDevice smartDevice : smartDeviceList) {
//            ((TV) smartDevice).changeVolume(volume);
//            dangerous to assume that all implementations/childs are of the same type,
//            better check with instanceof otherwise be ready for ClassCastException
            if (smartDevice instanceof TV) { //SmartDevice sm = new TV();
                ((TV) smartDevice).changeVolume(volume);
            } else if (smartDevice instanceof Radio) {
                ((Radio) smartDevice).changeVolume(volume);
            }
        }
    }

    public List<SmartDevice> getSmartDeviceList() {
        return smartDeviceList;
    }
}
