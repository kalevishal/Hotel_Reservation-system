package com.HotelReservation;

public class Hotel {

    String hotelName;
    int rating;
    double weekdayRegularCustomerCost;
    double weekendRegularCustomerCost;

    public Hotel() {

    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getWeekdayRegularCustomerCost() {
        return weekdayRegularCustomerCost;
    }

    public void setWeekdayRegularCustomerCost(double weekdayRegularCustomerCost) {
        this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
    }

    public double getWeekendRegularCustomerCost() {
        return weekendRegularCustomerCost;
    }

    public void setWeekendRegularCustomerCost(double weekendRegularCustomerCost) {
        this.weekendRegularCustomerCost = weekendRegularCustomerCost;
    }

    public Hotel(String hotelName, int rating, double weekdayRegularCustomerCost, double weekendRegularCustomerCost) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
        this.weekendRegularCustomerCost = weekendRegularCustomerCost;
    }

}