package com.example.demo.endpoint;

import com.example.demo.service.TranslateService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public Page<?> exportDataAsMap(@RequestParam char byStartChar, @PageableDefault(size = 100_000) Pageable pageable) {
        return translateService.exportDataAsMap(byStartChar, pageable);
    }

    @GetMapping("/save")
    public void save() {
        translateService.save();
    }

    @GetMapping("/count")
    public long count() {
        return translateService.count();
    }
}
