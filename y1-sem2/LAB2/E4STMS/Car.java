package E4STMS;

public class Car extends Vehicle{
    private int passengerCount;

    public Car(String plateNumber, String vehicleType, int passengerCount) {
        super(plateNumber, "Car");
        this.passengerCount = passengerCount;
    }

    @Override
    public void accelerate(double amount) {
        // update until speed limit (120km/h) is reached.
        if (speed + amount > 120) {
            speed = 120;
        } else {
            speed += amount;
        }
        // super.accelerate(amount);
    }

    public void displayCarDetails() {
        System.out.print("Car Plate number: " + plateNumber);
    }
}
