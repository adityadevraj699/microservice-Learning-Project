package com.lcwd.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("Resource not found on server");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
        super(resourceName + " not found with " + fieldName + " : " + fieldValue);
    }
}