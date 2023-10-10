package com.example.demo.repository.beginsChar;

import com.example.demo.entity.beginsChar.BeginsQChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsQCharRepository extends JpaRepository<BeginsQChar, Long> {

    Optional<BeginsQChar> findBySource(String source);
}
