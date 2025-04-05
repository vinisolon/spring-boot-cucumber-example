package org.vinisolon.cucumber.example.app.exception;

public class MyCustomException extends RuntimeException {

    public MyCustomException(String message) {
        super(message);
    }

}
