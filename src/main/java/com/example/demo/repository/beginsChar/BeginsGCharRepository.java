package com.example.demo.entity.beginsChar;

import com.example.demo.entity.beginsChar.BeginsGChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsGCharRepository extends JpaRepository<BeginsGChar, Long> {

    Optional<BeginsGChar> findBySource(String source);
}
