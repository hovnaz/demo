package com.example.demo.entity.beginsChar;

import com.example.demo.entity.beginsChar.BeginsNChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsNCharRepository extends JpaRepository<BeginsNChar, Long> {

    Optional<BeginsNChar> findBySource(String source);
}
