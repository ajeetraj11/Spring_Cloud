package com.lcwe.rating.service;

import com.lcwe.rating.model.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating createRating(Rating rating);

    //get all by userId
    List<Rating> getRatingByUserId(String userId);

    //get all by HotelId
    List<Rating> getRatingByHotelId(String hotelId);

//    get all rating by Rating
   List<Rating> getRatings();
}
