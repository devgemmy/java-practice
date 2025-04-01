package E4STMS;

public class Vehicle {
    //private String plateNumber;
    String plateNumber;
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
        issueFine();
        // until speed limit (100km/h) is reached.
    }

    protected void applyBrake(double amount) {
        this.speed -= amount;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    private void issueFine() {
        double speedLimit = vehicleType.equalsIgnoreCase("Car") ? 60.0 : 40.0;
        if (speed > speedLimit) {
            fineAmount = (speed - speedLimit) * 10;
            System.out.println("Fine: " + fineAmount);
        }
    }
}
