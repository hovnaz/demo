package com.example.demo.endpoint;

import com.example.demo.service.TranslateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/translate")
@RequiredArgsConstructor
public class TranslateEndpoint {

    private final TranslateService translateService;

    @PostMapping("/add")
    public void addTranslation(@RequestParam String source, @RequestParam String translation) {
        translateService.addTranslation(source, translation);
    }

    @GetMapping("/findBySource")
    public boolean findBySource(@RequestParam String source) {
        return translateService.findBySource(source);
    }

    @GetMapping("/exportData")
    public Map<String, String> exportDataAsMap() {
        return translateService.exportDataAsMap();
    }
}
