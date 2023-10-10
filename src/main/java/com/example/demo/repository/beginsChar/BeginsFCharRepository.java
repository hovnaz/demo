package com.example.demo.entity.beginsChar;

import com.example.demo.entity.beginsChar.BeginsFChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsFCharRepository extends JpaRepository<BeginsFChar, Long> {

    Optional<BeginsFChar> findBySource(String source);
}
