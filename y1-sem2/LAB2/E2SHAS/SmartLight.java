package E2SHAS;

public class SmartLight extends Device {
    int brightnessLevel = 50;

    public SmartLight(int deviceID, String deviceName, boolean status, int brLev) {
        super(deviceID, deviceName, status);
        this.brightnessLevel = brLev;
    }

    // Setters
    public void setBrightness(int level) {
        if (level < 0 || level > 100) {
            System.out.println("Brightness level is inapplicable. It has to be between 0 - 100");
        } else {
            this.brightnessLevel = level;
        }
    }


}
