package com.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("Resource Not Found");
    };

    public ResourceNotFoundException(String msg) {
        super(msg);
    }

}
