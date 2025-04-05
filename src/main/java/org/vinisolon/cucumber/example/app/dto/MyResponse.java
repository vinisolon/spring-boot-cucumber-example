package org.vinisolon.cucumber.example.app.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class MyResponse {

    private UUID id;

}
