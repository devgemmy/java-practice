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
        System.out.println("Car Plate number: " + this.plateNumber);
        // Error: make Vehicle.plateNumber package-private.
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Passenger Count: " + this.passengerCount);
        System.out.println("Current Speed: " + this.speed + "km/h \n=========================" );
    }
}
