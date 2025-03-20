package com.lcwd.hotel.services;

import com.lcwd.hotel.model.Hotel;

import java.util.List;

public interface HotelService {

    //create
    Hotel creatHotel(Hotel hotel);

    //getall
    List<Hotel> getAllHotel();

    //getsingle
    Hotel getHotel(String hotelId);

    //update
    Hotel udateHotel(Hotel hotel);

    //delete
    void deleteHotel(String hotelId);
    

}
