package org.vinisolon.cucumber.example.app.exception.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@Builder
@ToString
public class MyExceptionResponse {

    @Builder.Default
    @Setter(AccessLevel.PRIVATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime timestamp = LocalDateTime.now();

    private String message;

    public static MyExceptionResponse buildMyExceptionResponse(String message) {
        return MyExceptionResponse.builder()
                .message(message)
                .build();
    }

}
