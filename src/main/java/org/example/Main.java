package org.example;

public class Main {
    public static void main(String[] args) {
        BookingManager manager = BookingManager.getInstance();

        UserNotification user1 = new UserNotification("Alice");
        UserNotification user2 = new UserNotification("Bob");
        manager.addObserver(user1);
        manager.addObserver(user2);

        Booking movieBooking = BookingFactory.createBooking("movie", "Интерстеллар");
        Booking hotelBooking = BookingFactory.createBooking("hotel", "Hilton");
        Booking flightBooking = BookingFactory.createBooking("flight", "SU123");

        manager.addBooking(movieBooking);
        movieBooking.book();

        manager.addBooking(hotelBooking);
        hotelBooking.book();

        manager.addBooking(flightBooking);
        flightBooking.book();
        manager.cancelBooking(flightBooking);
        flightBooking.cancel();
    }
}