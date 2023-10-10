package com.example.demo.entity.beginsChar;

import com.example.demo.entity.beginsChar.BeginsTChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsTCharRepository extends JpaRepository<BeginsTChar, Long> {

    Optional<BeginsTChar> findBySource(String source);
}
