package org.vinisolon.cucumber.example.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.vinisolon.cucumber.example.app.rest.dto.MyExceptionResponse;
import org.vinisolon.cucumber.example.app.rest.dto.MyFieldValidationResponse;
import org.vinisolon.cucumber.example.app.rest.dto.MyValidationResponse;

import static org.vinisolon.cucumber.example.app.rest.dto.MyExceptionResponse.buildMyExceptionResponse;
import static org.vinisolon.cucumber.example.app.rest.dto.MyValidationResponse.buildValidationResponse;

@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    private ResponseEntity<MyExceptionResponse> handleException(Exception e) {
        var response = buildMyExceptionResponse(e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }

    @ExceptionHandler(MyCustomException.class)
    private ResponseEntity<MyExceptionResponse> handleBusinessException(MyCustomException e) {
        var response = buildMyExceptionResponse(e.getMessage());
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body(response);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    private ResponseEntity<MyValidationResponse> handleValidationException(MethodArgumentNotValidException e) {
        var errors = e.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(err -> new MyFieldValidationResponse(err.getField(), err.getDefaultMessage()))
                .toList();
        var response = buildValidationResponse(errors);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

}
