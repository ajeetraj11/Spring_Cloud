package com.lcwe.rating.controller;

import com.lcwe.rating.model.Rating;
import com.lcwe.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){

        String Uid=UUID.randomUUID().toString();
        rating.setRatingId(Uid);
        Rating rating1= ratingService.createRating(rating);
        return  ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getRatings(){
        List<Rating> rating= ratingService.getRatings();

        return ResponseEntity.status(HttpStatus.OK).body(rating);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
        List<Rating> ratings= ratingService.getRatingByUserId(userId);

        return ResponseEntity.status(HttpStatus.OK).body(ratings);
    }

    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
        List<Rating> ratings= ratingService.getRatingByHotelId(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(ratings);
    }

}
