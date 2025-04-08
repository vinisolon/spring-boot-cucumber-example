package org.vinisolon.cucumber.example.app.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vinisolon.cucumber.example.app.dto.MyRequest;
import org.vinisolon.cucumber.example.app.dto.MyResponse;
import org.vinisolon.cucumber.example.app.service.MyService;

import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cucumber")
public class MyController {

    private final MyService service;

    @GetMapping("/{id}")
    public ResponseEntity<MyResponse> get(@PathVariable("id") UUID id) {
        log.info("GET UUID -> {}", id);
        var response = service.get(id);
        log.info("GET RESPONSE -> {}", response);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping
    public ResponseEntity<List<MyResponse>> getAll() {
        log.info("GET ALL CALLED");
        var response = service.getAll();
        log.info("GET ALL RESPONSE -> {}", response);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping
    public ResponseEntity<MyResponse> createUpdate(@Valid @RequestBody MyRequest request) {
        log.info("CREATE/UPDATE REQUEST -> {}", request);
        var response = service.create(request);
        log.info("CREATE/UPDATE RESPONSE -> {}", response);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") UUID id) {
        log.info("DELETE UUID -> {}", id);
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
