package com.example.demo.entity.beginsChar;

import com.example.demo.entity.beginsChar.BeginsOChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsOCharRepository extends JpaRepository<BeginsOChar, Long> {

    Optional<BeginsOChar> findBySource(String source);
}
