package com.lcwd.hotel.controller;

import com.lcwd.hotel.model.Hotel;
import com.lcwd.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel hotel1=hotelService.creatHotel(hotel);
        return new ResponseEntity<>(hotel1, HttpStatus.CREATED);
    }

    @GetMapping
    public  ResponseEntity<?> getAllHotel(){
        return new ResponseEntity<>(hotelService.getAllHotel(),HttpStatus.OK);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<?> getHotel(@PathVariable String hotelId){
       Hotel hotel= hotelService.getHotel(hotelId);

       return  new ResponseEntity<>(hotel,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updatehotel(@RequestBody Hotel hotel){

        Hotel hotel1 = hotelService.udateHotel(hotel);
        return new ResponseEntity<>(hotel1,HttpStatus.OK);

    }

    @DeleteMapping("/{hotelId}")
    public ResponseEntity<?> deleteHotel(@PathVariable String hotelId){
        hotelService.deleteHotel(hotelId);
        return new ResponseEntity<>("Hotel Deleted Successfully",HttpStatus.OK);
    }
}
