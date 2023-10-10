package com.example.demo.entity.beginsChar;

import com.example.demo.entity.beginsChar.BeginsSChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsSCharRepository extends JpaRepository<BeginsSChar, Long> {

    Optional<BeginsSChar> findBySource(String source);
}
