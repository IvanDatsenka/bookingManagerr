package org.example;

public class HotelBooking implements Booking{
    private String hotelName;

    public HotelBooking(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public void book() {
        System.out.println("Hotel room was \"" + hotelName + "\" reserved.");
    }

    @Override
    public void cancel() {
        System.out.println("hotel reservation was \"" + hotelName + "\" canceled.");
    }
}
