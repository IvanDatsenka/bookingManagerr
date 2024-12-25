package org.example;

public class FlightBooking implements Booking{
    private String flightNumber;

    public FlightBooking(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public void book() {
        System.out.println("Flight \"" + flightNumber + "\"was reserved.");
    }

    @Override
    public void cancel() {
        System.out.println("Filght reservation \"" + flightNumber + "\"was canceled.");
    }
}
