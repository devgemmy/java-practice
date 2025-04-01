package E4STMS;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

// Traffic Management

public class TrafficControlSystem {
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    int speedLimit = 100; // km/h
    int count;

    public static void main(String[] args) {

        TrafficControlSystem traffics = new TrafficControlSystem();
        // 3 Cars
        Car audiR8 = new Car(generatePlateNumber(), "Car", 4);
        Car toyotaCorolla = new Car(generatePlateNumber(), "Car", 5);
        Car bmw_3series = new Car(generatePlateNumber(), "Car", 3);

        // 2 Trucks
        Truck cybertruck = new Truck(generatePlateNumber(), "Truck", 6);
        Truck ford_f150 = new Truck(generatePlateNumber(), "Truck", 7);

        // Registered vehicles.
        traffics.registerVehicle(audiR8);
        traffics.registerVehicle(toyotaCorolla);
        traffics.registerVehicle(bmw_3series);
        traffics.registerVehicle(cybertruck);
        traffics.registerVehicle(ford_f150);

        int vh = 0;
        do {
            if (Objects.equals(traffics.vehicles.get(vh).vehicleType, "Car")) {
                // -- Display vehicle details
                Car car = (Car) traffics.vehicles.get(vh);
                car.displayCarDetails();
            } else {
                // System.out.println("Vehicle Type: " + traffics.vehicles.get(i).vehicleType);
                Truck truck = (Truck) traffics.vehicles.get(vh);
                truck.displayTruckDetails();
            }

            traffics.checkSpeeding();
            traffics.enforceSpeedLimit();

            vh++;
        } while (vh < traffics.vehicles.size());
    }

    public void registerVehicle(Vehicle v) {
        this.vehicles.add(v);
    }

    public void checkSpeeding() {
        Random rand = new Random();
        count = 0;
        while (count < this.vehicles.size()) {
            if (Objects.equals(this.vehicles.get(count).vehicleType, "Car")) {
                Car car = (Car) this.vehicles.get(count);
                car.accelerate(rand.nextInt(150-50+1)+50);
            } else {
                Truck truck = (Truck) this.vehicles.get(count);
                truck.accelerate(rand.nextInt(150-50+1)+50);
            }
            count++;
        }
    }

    protected void enforceSpeedLimit() {
        count = 0;
        double vehSpeed;

        vehSpeed = this.vehicles.get(count).speed;

        if (vehSpeed > this.speedLimit) {
            this.vehicles.get(count).applyBrake(10);
        }
    }

    // ======= Added functions =====
    private static String generatePlateNumber() {
        Random rand = new Random();
        return randomLetters(3) + rand.nextInt(10) + " " + randomLetters(2) + rand.nextInt(10);
    }

    private static String randomLetters(int count) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(letters.charAt(rand.nextInt(letters.length())));
        }

        return sb.toString();
    }
}
