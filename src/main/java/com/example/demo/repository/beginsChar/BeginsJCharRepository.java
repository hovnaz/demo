package com.example.demo.repository.beginsChar;

import com.example.demo.entity.beginsChar.BeginsJChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsJCharRepository extends JpaRepository<BeginsJChar, Long> {

    Optional<BeginsJChar> findBySource(String source);
}
