package org.example;

import java.util.List;

public interface BookingObserver {
    void update(List<Booking> bookings);
}
