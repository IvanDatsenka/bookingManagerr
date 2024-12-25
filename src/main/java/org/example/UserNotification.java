package org.example;

import java.util.List;

public class UserNotification implements BookingObserver{
    private String userName;

    public UserNotification(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(List<Booking> bookings) {
        System.out.println("Пользователь " + userName + " уведомлён об изменении бронирований.");
    }
}
