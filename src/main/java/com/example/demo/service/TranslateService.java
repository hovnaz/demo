package com.example.demo.service;

import org.springframework.data.domain.Page;

public interface TranslateService {

    void addTranslation(String source, String translation);

    boolean findBySource(String source);

    Page<?> exportDataAsMap(char byStartChar);

    long count();
}
