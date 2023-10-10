package com.example.demo.repository;

import com.example.demo.entity.ReadyForTranslate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReadyForTranslateRepository extends JpaRepository<ReadyForTranslate, Long> {

    Optional<ReadyForTranslate> findBySource(String source);

}
