package com.example.demo.repository.beginsChar;

import com.example.demo.entity.beginsChar.BeginsEChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsECharRepository extends JpaRepository<BeginsEChar, Long> {

    Optional<BeginsEChar> findBySource(String source);
}
