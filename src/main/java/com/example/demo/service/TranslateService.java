package com.example.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TranslateService {

    void addTranslation(String source, String translation);

    boolean findBySource(String source);

    Page<?> exportDataAsMap(char byStartChar, Pageable pageable);

    void save();

    long count();
}
