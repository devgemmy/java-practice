package E4STMS;

public class Truck extends Vehicle {
    private double cargoWeight;

    public Truck(String plateNumber, String vehicleType, double cargoWeight) {
        super(plateNumber, "Truck");
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void accelerate(double amount) {
        if ((speed + amount) > 80) {
            speed = 80;
        } else {
            speed += amount;
        }
    }

    public void displayTruckDetails() {
        System.out.println("Truck plate number: " + plateNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Cargo Weight: " + cargoWeight);
        System.out.println("Current Speed: " + speed + "km/h \n=========================");
    }
}
