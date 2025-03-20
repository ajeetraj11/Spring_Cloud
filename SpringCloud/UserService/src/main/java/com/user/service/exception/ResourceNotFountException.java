package com.user.service.exception;

public class ResourceNotFountException extends RuntimeException{

     public ResourceNotFountException(){
          super("Resource not found on server !!");
     }

     public ResourceNotFountException(String message){
          super(message);
     }
}
