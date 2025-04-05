package org.vinisolon.cucumber.example.app.exception.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@ToString
public class MyValidationResponse {

    @Builder.Default
    @Setter(AccessLevel.PRIVATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime timestamp = LocalDateTime.now();

    private List<MyFieldValidationResponse> errors;

    public static MyValidationResponse buildValidationResponse(List<MyFieldValidationResponse> errors) {
        return MyValidationResponse.builder()
                .errors(errors)
                .build();
    }

}
