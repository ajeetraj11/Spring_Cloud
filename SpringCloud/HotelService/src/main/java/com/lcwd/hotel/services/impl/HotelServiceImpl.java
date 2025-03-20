package com.lcwd.hotel.services.impl;

import com.lcwd.hotel.exception.ResourceNotFoundException;
import com.lcwd.hotel.model.Hotel;
import com.lcwd.hotel.repository.HotelRepository;
import com.lcwd.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelrepo;

    @Override
    public Hotel creatHotel(Hotel hotel) {
        String Uid=UUID.randomUUID().toString();
        hotel.setHotelid(Uid);
        return hotelrepo.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelrepo.findAll();
    }

    @Override
    public Hotel getHotel(String hotelId) {
        return hotelrepo.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("This id is not present"));
    }

    @Override
    public Hotel udateHotel(Hotel hotel) {
        return hotelrepo.save(hotel);
    }

    @Override
    public void deleteHotel(String hotelId) {
        hotelrepo.deleteById(hotelId);
    }
}
