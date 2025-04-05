package org.vinisolon.cucumber.example.app.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.vinisolon.cucumber.example.app.mapper.MyMapper;
import org.vinisolon.cucumber.example.app.repository.MyRepository;
import org.vinisolon.cucumber.example.app.rest.dto.MyRequest;
import org.vinisolon.cucumber.example.app.rest.dto.MyResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class MyService {

    private final MyRepository repository;
    private final MyMapper mapper;

    @Transactional
    public MyResponse create(MyRequest request) {
        return MyResponse.builder().build();
    }

    @Transactional
    public void delete(UUID id) {
    }

    public MyResponse get(UUID id) {
        return MyResponse.builder().build();
    }

    public List<MyResponse> getAll() {
        return new ArrayList<>();
    }

}
