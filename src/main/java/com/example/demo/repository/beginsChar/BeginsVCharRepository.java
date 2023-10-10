package com.example.demo.repository.beginsChar;

import com.example.demo.entity.beginsChar.BeginsVChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsVCharRepository extends JpaRepository<BeginsVChar, Long> {

    Optional<BeginsVChar> findBySource(String source);
}
