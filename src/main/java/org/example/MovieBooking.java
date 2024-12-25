package org.example;

public class MovieBooking implements Booking{
    private String filmName;

    public MovieBooking(String filmName){
        this.filmName=filmName;
    }


    @Override
    public void book() {
        System.out.println("ticket reserved "+filmName);
    }

    @Override
    public void cancel() {
        System.out.println("ticket canceled "+filmName);
    }
}
