package com.flipmart.services.flipmartauthenticationservice.exceptions;

public class InvalidSignUpException extends RuntimeException {
    public InvalidSignUpException(String message) {
        super(message);
    }
}