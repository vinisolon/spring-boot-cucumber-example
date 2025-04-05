package org.vinisolon.cucumber.example.app.rest.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class MyResponse {

    private UUID id;

}
