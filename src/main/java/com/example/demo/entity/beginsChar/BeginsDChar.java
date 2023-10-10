package com.example.demo.entity.beginsChar;

import com.example.demo.entity.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "begins_d_char")
public class BeginsDChar extends AbstractEntity {

    @Column(nullable = false, unique = true)
    private String source;

    @Column(nullable = false)
    private String translation;
}
