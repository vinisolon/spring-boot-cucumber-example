package org.vinisolon.cucumber.example.app.exception.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class MyFieldValidationResponse {

    private String field;
    private String message;

}
