package com.pentagono.pentagono.exceptions;/*jessica 1 sept no entiendo porque le sale un rayito en la C de class*/

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModelNotFoundException extends Exception{

    public ModelNotFoundException(String message) {
        super(message);
    }
}
