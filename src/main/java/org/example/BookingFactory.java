package org.example;

public class BookingFactory {
    public static Booking createBooking(String type, String detail) {
        switch (type.toLowerCase()) {
            case "movie":
                return new MovieBooking(detail);
            case "hotel":
                return new HotelBooking(detail);
            case "flight":
                return new FlightBooking(detail);
            default:
                throw new IllegalArgumentException("Неизвестный тип бронирования: " + type);
        }
    }
}
