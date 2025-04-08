package org.vinisolon.cucumber.example.app.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class MyRequest {

    private UUID id;

    @NotBlank
    private String title;

    @NotNull
    private Integer episodes;

    @NotNull
    private Integer seasons;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate releaseDate;

}
