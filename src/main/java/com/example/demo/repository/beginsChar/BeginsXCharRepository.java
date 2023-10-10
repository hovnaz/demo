package com.example.demo.entity.beginsChar;

import com.example.demo.entity.beginsChar.BeginsXChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsXCharRepository extends JpaRepository<BeginsXChar, Long> {

    Optional<BeginsXChar> findBySource(String source);
}
