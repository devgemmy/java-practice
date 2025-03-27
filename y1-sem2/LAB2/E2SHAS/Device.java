package E2SHAS;

import java.util.ArrayList;

public class Device {
    private int deviceID;
    protected String deviceName;
    public boolean status;

    Device(int deviceID, String deviceName) {
        this.deviceID = deviceID;
        this.deviceName = deviceName;
        this.status = false;
    }

    public void turnOn() {
        this.status = true;
    }
    public void turnOff() {
        this.status = false;
    }

    // Prints the device’s state.
    protected void displayStatus() {
        System.out.println(this.status);
    }
    // A private method to log device state changes.
    private void logOperation(String operation) {
        ArrayList<Boolean> statusLog = new ArrayList<Boolean>();
        if (operation.equals("turnOff")) {
            statusLog.add(false);
        } else {
            statusLog.add(true);
        }
    }
}
