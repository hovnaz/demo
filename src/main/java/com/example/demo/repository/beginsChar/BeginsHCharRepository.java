package com.example.demo.entity.beginsChar;

import com.example.demo.entity.beginsChar.BeginsHChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsHCharRepository extends JpaRepository<BeginsHChar, Long> {

    Optional<BeginsHChar> findBySource(String source);
}
