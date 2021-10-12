package com.HotelReservation;

import org.junit.Test;;
import org.junit.Assert;

public class HotelReservationTest {
    @Test
    public void givenHotelDetails_WhenValuesEnteredCorrect_ShouldReturnTrue() {
        HotelReservationTest hotelReservationService = new HotelReservationTest();
        boolean isValidHotel1 = hotelReservationService.addHotel("Lakewood", 3, 110, 90);
        Assert.assertEquals(true, isValidHotel1);
    }

    @Test
    public void GivenHotelDetails_WhenValuesEnteredIncorrect_ShouldReturnFalse() {
        HotelReservation hotelReservationService = new HotelReservation();
        boolean isValidHotel1 = hotelReservationService.addHotel(null, 3, 110, 90);
        Assert.assertEquals(false, isValidHotel1);
    }

}