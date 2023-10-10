package com.example.demo.repository.beginsChar;

import com.example.demo.entity.beginsChar.BeginsMChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsMCharRepository extends JpaRepository<BeginsMChar, Long> {

    Optional<BeginsMChar> findBySource(String source);
}
