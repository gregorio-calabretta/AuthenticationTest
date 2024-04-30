package com.example.AuthenticationTest.exception;

import java.io.InvalidObjectException;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message){
        super(message);
    }



    public String getMessage(){
        return "User not found";
    }
}
