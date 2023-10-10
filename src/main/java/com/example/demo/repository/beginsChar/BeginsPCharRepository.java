package com.example.demo.entity.beginsChar;

import com.example.demo.entity.beginsChar.BeginsPChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsPCharRepository extends JpaRepository<BeginsPChar, Long> {

    Optional<BeginsPChar> findBySource(String source);
}
