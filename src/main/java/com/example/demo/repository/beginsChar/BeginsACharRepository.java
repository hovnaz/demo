package com.example.demo.repository.beginsChar;

import com.example.demo.entity.beginsChar.BeginsAChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsACharRepository extends JpaRepository<BeginsAChar, Long> {

    Optional<BeginsAChar> findBySource(String source);
}
