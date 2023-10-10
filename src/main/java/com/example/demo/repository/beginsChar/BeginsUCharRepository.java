package com.example.demo.repository.beginsChar;

import com.example.demo.entity.beginsChar.BeginsUChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsUCharRepository extends JpaRepository<BeginsUChar, Long> {

    Optional<BeginsUChar> findBySource(String source);
}
