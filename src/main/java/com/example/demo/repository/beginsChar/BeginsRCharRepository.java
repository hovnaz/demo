package com.example.demo.repository.beginsChar;

import com.example.demo.entity.beginsChar.BeginsRChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsRCharRepository extends JpaRepository<BeginsRChar, Long> {

    Optional<BeginsRChar> findBySource(String source);
}
