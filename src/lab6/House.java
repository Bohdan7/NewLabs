package lab6;

import java.util.Arrays;
import java.util.Comparator;

public class House {

    private int counter;
    private Device[] devices = new Device[4];


    public void addDevice(Device device) {
        devices[counter++] = device;
    }

    public int getPowerResult() {
        int result = 0;
        for (Device device : devices) {
            if ((device != null) && device.isOn()) {
                result += device.getPower() * device.getAmount();
            }
        }
        return result;
    }

    public void serchDevInduct(int induct1, int induct2) {
        for (Device device : devices) {
            if (device != null) {
                if (device.getInduction() > induct1 && device.getInduction() < induct2) {
                    System.out.println(device.getName() + " " + "Індукція = " + device.getInduction());
                }
            }
        }
    }

    public void sortDevByPower() {
        Arrays.sort(devices, Comparator.comparingInt(Device::getPower));
        System.out.println(Arrays.toString(devices));
    }

}