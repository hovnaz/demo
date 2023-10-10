package com.example.demo.repository.beginsChar;

import com.example.demo.entity.beginsChar.BeginsDChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsDCharRepository extends JpaRepository<BeginsDChar, Long> {

    Optional<BeginsDChar> findBySource(String source);
}
