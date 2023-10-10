package com.example.demo.service.impl;

import com.example.demo.entity.ReadyForTranslate;
import com.example.demo.repository.ReadyForTranslateRepository;
import com.example.demo.service.ReadyForTranslateService;
import com.example.demo.service.TranslateService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReadyForTranslateServiceImpl implements ReadyForTranslateService {

    private final ReadyForTranslateRepository readyForTranslateRepository;
    private final TranslateService translateService;

    @Override
    public void add(String source) {
        String newSource = source.toLowerCase().replaceAll("\\s+", " ").trim();
        if (translateService.findBySource(newSource)){
            return;
        }
        Optional<ReadyForTranslate> bySourceOptional = readyForTranslateRepository.findBySource(newSource);
        if (bySourceOptional.isEmpty()) {
            ReadyForTranslate build = ReadyForTranslate.builder()
                    .source(newSource)
                    .build();
            readyForTranslateRepository.save(build);
        }
    }

    @Override
    public List<String> getAndRemoveTop100() {
        Pageable pageable = Pageable.ofSize(100);
        Page<ReadyForTranslate> readyForTranslates = readyForTranslateRepository.findAll(pageable);

        List<String> sourceValues = new ArrayList<>();

        for (ReadyForTranslate item : readyForTranslates.getContent()) {
            sourceValues.add(item.getSource());
        }

        readyForTranslateRepository.deleteAll(readyForTranslates);

        return sourceValues;
    }
}
