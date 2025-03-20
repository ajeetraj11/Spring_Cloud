package com.lcwe.rating.service.impl;

import com.lcwe.rating.model.Rating;
import com.lcwe.rating.repository.RatingRepository;
import com.lcwe.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }
    @Override
    public List<Rating> getRatingByUserId(String userId) {
       return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
         return ratingRepository.findByHotelId(hotelId);
    }
}
