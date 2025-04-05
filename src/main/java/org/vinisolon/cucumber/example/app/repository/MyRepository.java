package org.vinisolon.cucumber.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vinisolon.cucumber.example.app.entity.MyEntity;

import java.util.UUID;

@Repository
public interface MyRepository extends JpaRepository<MyEntity, UUID> {
}
