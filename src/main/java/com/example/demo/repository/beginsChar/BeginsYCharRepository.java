package com.example.demo.entity.beginsChar;

import com.example.demo.entity.beginsChar.BeginsYChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsYCharRepository extends JpaRepository<BeginsYChar, Long> {

    Optional<BeginsYChar> findBySource(String source);
}
