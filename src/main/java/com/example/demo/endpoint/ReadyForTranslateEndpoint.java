package com.example.demo.endpoint;

import com.example.demo.entity.ReadyForTranslate;
import com.example.demo.service.ReadyForTranslateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/new")
@RequiredArgsConstructor
public class ReadyForTranslateEndpoint {

    private final ReadyForTranslateService readyForTranslateService;

    @PostMapping("/add")
    public void addSource(@RequestParam String source) {
        readyForTranslateService.add(source);
    }

    @GetMapping("/getAndRemove")
    public List<String> getTop100() {
        return readyForTranslateService.getAndRemoveTop100();
    }

    @GetMapping("/all")
    public List<ReadyForTranslate> getAll() {
        return readyForTranslateService.getAll();
    }

    @GetMapping("/count")
    public long count() {
        return readyForTranslateService.count();
    }
}
