package com.example.demo.service;

import java.util.Map;

public interface TranslateService {

    void addTranslation(String source, String translation);

    boolean findBySource(String source);

    Map<String, String> exportDataAsMap();
}
