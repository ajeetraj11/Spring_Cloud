package com.lcwd.hotel.exception;

import com.lcwd.hotel.payload.Apiresponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Apiresponse> handleResourceNotFoundException(ResourceNotFoundException ex){

        String message= ex.getMessage();

        Apiresponse response= Apiresponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();

        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }
}
