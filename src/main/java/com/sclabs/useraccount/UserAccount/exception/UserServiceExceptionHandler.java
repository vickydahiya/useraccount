package com.sclabs.useraccount.UserAccount.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

public class UserServiceExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserCreationException.class)
    public ResponseEntity<Object> handleUserCreationException(UserCreationException ex){
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(),ex.getMessage(), ex.getMessage());
        return new ResponseEntity<Object>(exceptionResponse,HttpStatus.NOT_ACCEPTABLE);
    }
}
