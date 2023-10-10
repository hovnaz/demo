package com.example.demo.repository.beginsChar;

import com.example.demo.entity.beginsChar.BeginsWChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsWCharRepository extends JpaRepository<BeginsWChar, Long> {

    Optional<BeginsWChar> findBySource(String source);
}
