package com.example.demo.entity.beginsChar;

import com.example.demo.entity.beginsChar.BeginsLChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsLCharRepository extends JpaRepository<BeginsLChar, Long> {

    Optional<BeginsLChar> findBySource(String source);
}
