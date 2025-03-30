package E4STMS;

public class Vehicle {
    private String plateNumber;
    protected String vehicleType;
    public double speed;
    private double fineAmount;

    public Vehicle(String plateNumber, String vehicleType) {
        this.plateNumber = plateNumber;
        this.vehicleType = vehicleType;
        this.speed = 0.0;
    }

    public void accelerate(double amount) {
        this.speed += amount;
        // until speed limit (100km/h) is reached.
    }

    protected void applyBrake(double amount) {
        this.speed -= amount;
    }

    private void issueFine() {
        fineAmount += speed * 0.2;
    }
}
