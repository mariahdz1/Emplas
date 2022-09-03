package com.pentagono.pentagono.exceptions;


//@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModelNotFoundException extends Exception{

    public ModelNotFoundException(String message) {
        super(message);
    }
}
