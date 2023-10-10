package com.example.demo.entity.beginsChar;

import com.example.demo.entity.beginsChar.BeginsZChar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BeginsZCharRepository extends JpaRepository<BeginsZChar, Long> {

    Optional<BeginsZChar> findBySource(String source);
}
