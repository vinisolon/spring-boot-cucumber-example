package org.vinisolon.cucumber.example.app.exception.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ErrorMessagesEnum {

    DEFAULT_ERROR_MESSAGE("Error message");

    private final String message;

}
