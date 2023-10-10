package com.example.demo.repository.beginsChar;

import com.example.demo.entity.beginsChar.BeginsKChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsKCharRepository extends JpaRepository<BeginsKChar, Long> {

    Optional<BeginsKChar> findBySource(String source);
}
