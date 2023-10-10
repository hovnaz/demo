package com.example.demo.entity.beginsChar;

import com.example.demo.entity.beginsChar.BeginsIChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsICharRepository extends JpaRepository<BeginsIChar, Long> {

    Optional<BeginsIChar> findBySource(String source);
}
