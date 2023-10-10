package com.example.demo.repository.beginsChar;

import com.example.demo.entity.beginsChar.BeginsCChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsCCharRepository extends JpaRepository<BeginsCChar, Long> {

    Optional<BeginsCChar> findBySource(String source);
}
