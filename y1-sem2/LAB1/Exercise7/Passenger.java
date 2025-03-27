package Exercise7;

import java.util.Scanner;

public class Passenger {
    private int passengerID;
    private String name;
    private int seatNumber;

    public Passenger(int passID, String passName, int seatNum) {
        this.passengerID = passID;
        this.name = passName;
        this.seatNumber = seatNum;
    }

    // Getters
    public String getDetails() {
        return (String)"Name: " + this.name + ", Seat Number: " + this.seatNumber + ", ID:" + this.passengerID;
    }

    public static void main(String[] args) {

    }
}
