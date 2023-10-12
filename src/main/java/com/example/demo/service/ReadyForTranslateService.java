package com.example.demo.service;

import com.example.demo.entity.ReadyForTranslate;

import java.util.List;

public interface ReadyForTranslateService {

    void add(String source);

    List<String> getAndRemoveTop100();

    List<ReadyForTranslate> getAll();

    long count();
}
