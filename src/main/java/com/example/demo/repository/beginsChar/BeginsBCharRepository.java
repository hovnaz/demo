package com.example.demo.entity.beginsChar;

import com.example.demo.entity.beginsChar.BeginsBChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsBCharRepository extends JpaRepository<BeginsBChar, Long> {

    Optional<BeginsBChar> findBySource(String source);
}
