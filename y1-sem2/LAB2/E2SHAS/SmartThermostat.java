package E2SHAS;

public class SmartThermostat extends Device{
    private double temperature;

    public SmartThermostat(int deviceID, String deviceName, boolean status, double temp) {
        super(deviceID, deviceName, status);
        this.temperature = temp;
    }

    // Setters
    public void setTemperature(double temp) {
        if (temp < 15 || temp > 30) {
            System.out.println("Brightness level is inapplicable. It has to be between 0 - 100");
        } else {
            this.temperature = temp;
        }
        this.temperature = temp;
    }

}
