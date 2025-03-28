package E2SHAS;

// Smart Home Automation System

import java.util.ArrayList;
import java.util.Random;

public class SmartHomeSystem {
    public static void main(String[] args) {
        ArrayList<Device> diffDevices = new ArrayList<Device>();
        Random rand = new Random(100-30+1);
        SmartLight bulbLight = new SmartLight(900, "Light Bulb", true, 30);
        SmartLight streetLight = new SmartLight(900, "Light Bulb", false, 60);
        SmartThermostat bodyThermo = new SmartThermostat(900, "Thermometer", false, 27);
        SmartThermostat chairThermo = new SmartThermostat(900, "Massager", true, 16);

        diffDevices.add(bulbLight);
        diffDevices.add(streetLight);
        diffDevices.add(bodyThermo);
        diffDevices.add(chairThermo);

        System.out.println("Devices: " + diffDevices);

        do {
            bulbLight.turnOn();
            bulbLight.setBrightness(50);

            streetLight.turnOff();
            streetLight.setBrightness(50);

            bodyThermo.turnOn();
            bodyThermo.setTemperature(19);

            chairThermo.turnOn();
            chairThermo.setTemperature(22);

            for(Device d : diffDevices) {
                System.out.println(d.deviceName + "'s current status: " + d.status);
            }
        } while (true);
    }
}
