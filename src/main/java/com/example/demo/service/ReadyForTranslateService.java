package com.example.demo.service;

import java.util.List;

public interface ReadyForTranslateService {

    void add(String source);

    List<String> getAndRemoveTop100();
}
