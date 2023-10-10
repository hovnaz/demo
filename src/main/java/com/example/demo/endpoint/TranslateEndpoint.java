package com.example.demo;

import com.example.demo.service.ReadyForTranslateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/translate")
@RequiredArgsConstructor
public class TranslateEndpoint {

    private final ReadyForTranslateService translateService;


    @PostMapping
    public void addTranslation(@RequestBody String source) {
        translateService.add(source);
    }

    @GetMapping("/list")
    public List<String> getTop100Translations() {
        return translateService.getAndRemoveTop100();
    }
}
