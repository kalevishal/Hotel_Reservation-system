package com.HotelReservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class HotelReservation {

    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
    Hotel hotel;


    public boolean addHotel(String hotelName, int rating, double weekdayRateRegular, double weekendRateRegular) {
        hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setRating(rating);
        hotel.setWeekdayRegularCustomerCost(weekdayRateRegular);
        hotel.setWeekendRegularCustomerCost(weekendRateRegular);
        hotelList.add(hotel);
        return true;
    }
}