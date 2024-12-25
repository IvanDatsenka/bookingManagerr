package org.example;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private static BookingManager instance;
    private List<Booking> bookings = new ArrayList<>();

    private BookingManager() {}

    public static BookingManager getInstance() {
        if (instance == null) {
            instance = new BookingManager();
        }
        return instance;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
        notifyObservers();
    }

    public void cancelBooking(Booking booking) {
        bookings.remove(booking);
        notifyObservers();
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    private List<BookingObserver> observers = new ArrayList<>();

    public void addObserver(BookingObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (BookingObserver observer : observers) {
            observer.update(bookings);
        }
    }
}
