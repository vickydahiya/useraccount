package com.sclabs.useraccount.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class UserCreationException extends RuntimeException {
    public UserCreationException(String message) {
        super(message);
    }
}



