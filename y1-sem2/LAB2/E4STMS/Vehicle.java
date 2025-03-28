package E4STMS;

public class Vehicle {
    private String plateNumber;
    protected String vehicleType;
    public double speed = 0.0;
    private double fineAmount;

    public Vehicle(String plateNumber, String vehicleType, double speed) {
        this.plateNumber = plateNumber;
        this.vehicleType = vehicleType;
        this.speed = speed;
    }

    public void accelerate(double amount) {
        this.speed += amount;
    }

    protected void applyBrake(double amount) {
        this.speed -= amount;
    }

    private void issueFine() {
        fineAmount += speed * 0.2;
    }
}
