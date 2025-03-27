package Exercise7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Airplane {
    private int totalSeats = 10;
    private Integer[] seats;
    private ArrayList<Passenger> passengerList;

    public Airplane() {
        seats = new Integer[totalSeats];
        passengerList = new ArrayList<>();
    }

    public void bookSeat(int seatNumber, String name) {
        boolean available = Arrays.stream(seats).anyMatch(seat -> seat == seatNumber);
        if (!available) {
            System.out.println("Seat number " + seatNumber + " is already booked by " + name);
            System.out.println("Book another seat");
        } else {
            passengerList.add(new Passenger(passengerList.size()+1, name, seatNumber));
        }
    }

    public void cancelReservation(int seatNumber) {
        boolean booked = false;
        for (Passenger passenger : passengerList) {
            booked = passengerList.contains(passenger.getDetails());
        }
        if (booked) {
            passengerList.remove(seatNumber);
        } else {
            System.out.println("Seat number " + seatNumber + " is already cancelled");
        }
    }

    public void displayAvailableSeats() {
        for (int i = 0; i < totalSeats; i++) {
            System.out.println("Seat " + (i + 1) + ": " + (seats[i] == null ? "Available" : "Occupied"));
        }
    }

    public void displayPassengerList() {
        System.out.println("Booked Passengers: " + passengerList);
    }

    static void exitCounter() {
        String[] menu = {"Book a seat", "Cancel a reservation", "View available seats", "View passenger list", "Exit"};

        int i = 0;
        while (i < 5) {
            System.out.println(i + 1 + ". " + menu[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        exitCounter();

        System.out.println("\nWelcome to the Airline Reservation System");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = userInput.nextInt();

        switch (choice) {
            case 1:
                // Ask for the passenger's name and desired seat number, then call bookSeat().
                break;
            case 2:
                // Ask for the seat number and call cancelReservation().
                break;
            case 3:
                // Call displayAvailableSeats().
                break;
            case 4:
                // Call displayPassengerList().
                break;
            case 5:
                exitCounter();
                break;
            default:

                break;
        }
    }

}
