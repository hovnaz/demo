package com.example.demo.service.impl;

import com.example.demo.entity.beginsChar.*;
import com.example.demo.repository.beginsChar.*;
import com.example.demo.service.TranslateService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TranslateServiceImpl implements TranslateService {

    private final BeginsACharRepository beginsACharRepository;
    private final BeginsBCharRepository beginsBCharRepository;
    private final BeginsCCharRepository beginsCCharRepository;
    private final BeginsDCharRepository beginsDCharRepository;
    private final BeginsECharRepository beginsECharRepository;
    private final BeginsFCharRepository beginsFCharRepository;
    private final BeginsGCharRepository beginsGCharRepository;
    private final BeginsHCharRepository beginsHCharRepository;
    private final BeginsICharRepository beginsICharRepository;
    private final BeginsJCharRepository beginsJCharRepository;
    private final BeginsKCharRepository beginsKCharRepository;
    private final BeginsLCharRepository beginsLCharRepository;
    private final BeginsMCharRepository beginsMCharRepository;
    private final BeginsNCharRepository beginsNCharRepository;
    private final BeginsOCharRepository beginsOCharRepository;
    private final BeginsPCharRepository beginsPCharRepository;
    private final BeginsQCharRepository beginsQCharRepository;
    private final BeginsRCharRepository beginsRCharRepository;
    private final BeginsSCharRepository beginsSCharRepository;
    private final BeginsTCharRepository beginsTCharRepository;
    private final BeginsUCharRepository beginsUCharRepository;
    private final BeginsVCharRepository beginsVCharRepository;
    private final BeginsWCharRepository beginsWCharRepository;
    private final BeginsXCharRepository beginsXCharRepository;
    private final BeginsYCharRepository beginsYCharRepository;
    private final BeginsZCharRepository beginsZCharRepository;


    @Override
    public void addTranslation(String source, String translation) {

        if (source.length() == 0) {
            return;
        }
        char startingChar = Character.toLowerCase(source.charAt(0));
        switch (startingChar) {
            case 'a' -> {
                Optional<BeginsAChar> bySourceAOptional = beginsACharRepository.findBySource(source);
                if (bySourceAOptional.isEmpty()) {
                    BeginsAChar build = BeginsAChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsACharRepository.save(build);
                }
            }
            case 'b' -> {
                Optional<BeginsBChar> bySourceBOptional = beginsBCharRepository.findBySource(source);
                if (bySourceBOptional.isEmpty()) {
                    BeginsBChar build = BeginsBChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsBCharRepository.save(build);
                }
            }
            case 'c' -> {
                Optional<BeginsCChar> bySourceCOptional = beginsCCharRepository.findBySource(source);
                if (bySourceCOptional.isEmpty()) {
                    BeginsCChar build = BeginsCChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsCCharRepository.save(build);
                }
            }
            case 'd' -> {
                Optional<BeginsDChar> bySourceDOptional = beginsDCharRepository.findBySource(source);
                if (bySourceDOptional.isEmpty()) {
                    BeginsDChar build = BeginsDChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsDCharRepository.save(build);
                }
            }
            case 'e' -> {
                Optional<BeginsEChar> bySourceEOptional = beginsECharRepository.findBySource(source);
                if (bySourceEOptional.isEmpty()) {
                    BeginsEChar build = BeginsEChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsECharRepository.save(build);
                }
            }
            case 'f' -> {
                Optional<BeginsFChar> bySourceFOptional = beginsFCharRepository.findBySource(source);
                if (bySourceFOptional.isEmpty()) {
                    BeginsFChar build = BeginsFChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsFCharRepository.save(build);
                }
            }
            case 'g' -> {
                Optional<BeginsGChar> bySourceGOptional = beginsGCharRepository.findBySource(source);
                if (bySourceGOptional.isEmpty()) {
                    BeginsGChar build = BeginsGChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsGCharRepository.save(build);
                }
            }
            case 'h' -> {
                Optional<BeginsHChar> bySourceHOptional = beginsHCharRepository.findBySource(source);
                if (bySourceHOptional.isEmpty()) {
                    BeginsHChar build = BeginsHChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsHCharRepository.save(build);
                }
            }
            case 'i' -> {
                Optional<BeginsIChar> bySourceIOptional = beginsICharRepository.findBySource(source);
                if (bySourceIOptional.isEmpty()) {
                    BeginsIChar build = BeginsIChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsICharRepository.save(build);
                }
            }
            case 'j' -> {
                Optional<BeginsJChar> bySourceJOptional = beginsJCharRepository.findBySource(source);
                if (bySourceJOptional.isEmpty()) {
                    BeginsJChar build = BeginsJChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsJCharRepository.save(build);
                }
            }
            case 'k' -> {
                Optional<BeginsKChar> bySourceKOptional = beginsKCharRepository.findBySource(source);
                if (bySourceKOptional.isEmpty()) {
                    BeginsKChar build = BeginsKChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsKCharRepository.save(build);
                }
            }
            case 'l' -> {
                Optional<BeginsLChar> bySourceLOptional = beginsLCharRepository.findBySource(source);
                if (bySourceLOptional.isEmpty()) {
                    BeginsLChar build = BeginsLChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsLCharRepository.save(build);
                }
            }
            case 'm' -> {
                Optional<BeginsMChar> bySourceMOptional = beginsMCharRepository.findBySource(source);
                if (bySourceMOptional.isEmpty()) {
                    BeginsMChar build = BeginsMChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsMCharRepository.save(build);
                }
            }
            case 'n' -> {
                Optional<BeginsNChar> bySourceNOptional = beginsNCharRepository.findBySource(source);
                if (bySourceNOptional.isEmpty()) {
                    BeginsNChar build = BeginsNChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsNCharRepository.save(build);
                }
            }
            case 'o' -> {
                Optional<BeginsOChar> bySourceOOptional = beginsOCharRepository.findBySource(source);
                if (bySourceOOptional.isEmpty()) {
                    BeginsOChar build = BeginsOChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsOCharRepository.save(build);
                }
            }
            case 'p' -> {
                Optional<BeginsPChar> bySourcePOptional = beginsPCharRepository.findBySource(source);
                if (bySourcePOptional.isEmpty()) {
                    BeginsPChar build = BeginsPChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsPCharRepository.save(build);
                }
            }
            case 'q' -> {
                Optional<BeginsQChar> bySourceQOptional = beginsQCharRepository.findBySource(source);
                if (bySourceQOptional.isEmpty()) {
                    BeginsQChar build = BeginsQChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsQCharRepository.save(build);
                }
            }
            case 'r' -> {
                Optional<BeginsRChar> bySourceROptional = beginsRCharRepository.findBySource(source);
                if (bySourceROptional.isEmpty()) {
                    BeginsRChar build = BeginsRChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsRCharRepository.save(build);
                }
            }
            case 's' -> {
                Optional<BeginsSChar> bySourceSOptional = beginsSCharRepository.findBySource(source);
                if (bySourceSOptional.isEmpty()) {
                    BeginsSChar build = BeginsSChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsSCharRepository.save(build);
                }
            }
            case 't' -> {
                Optional<BeginsTChar> bySourceTOptional = beginsTCharRepository.findBySource(source);
                if (bySourceTOptional.isEmpty()) {
                    BeginsTChar build = BeginsTChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsTCharRepository.save(build);
                }
            }
            case 'u' -> {
                Optional<BeginsUChar> bySourceUOptional = beginsUCharRepository.findBySource(source);
                if (bySourceUOptional.isEmpty()) {
                    BeginsUChar build = BeginsUChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsUCharRepository.save(build);
                }
            }
            case 'v' -> {
                Optional<BeginsVChar> bySourceVOptional = beginsVCharRepository.findBySource(source);
                if (bySourceVOptional.isEmpty()) {
                    BeginsVChar build = BeginsVChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsVCharRepository.save(build);
                }
            }
            case 'w' -> {
                Optional<BeginsWChar> bySourceWOptional = beginsWCharRepository.findBySource(source);
                if (bySourceWOptional.isEmpty()) {
                    BeginsWChar build = BeginsWChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsWCharRepository.save(build);
                }
            }
            case 'x' -> {
                Optional<BeginsXChar> bySourceXOptional = beginsXCharRepository.findBySource(source);
                if (bySourceXOptional.isEmpty()) {
                    BeginsXChar build = BeginsXChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsXCharRepository.save(build);
                }
            }
            case 'y' -> {
                Optional<BeginsYChar> bySourceYOptional = beginsYCharRepository.findBySource(source);
                if (bySourceYOptional.isEmpty()) {
                    BeginsYChar build = BeginsYChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsYCharRepository.save(build);
                }
            }
            case 'z' -> {
                Optional<BeginsZChar> bySourceZOptional = beginsZCharRepository.findBySource(source);
                if (bySourceZOptional.isEmpty()) {
                    BeginsZChar build = BeginsZChar.builder()
                            .source(source)
                            .translation(translation)
                            .build();
                    beginsZCharRepository.save(build);
                }
            }
        }
    }

    public boolean findBySource(String source) {
        if (source.length() == 0) {
            return false;
        }
        char startingChar = Character.toLowerCase(source.charAt(0));
        return switch (startingChar) {
            case 'a' -> beginsACharRepository.findBySource(source).isPresent();
            case 'b' -> beginsBCharRepository.findBySource(source).isPresent();
            case 'c' -> beginsCCharRepository.findBySource(source).isPresent();
            case 'd' -> beginsDCharRepository.findBySource(source).isPresent();
            case 'e' -> beginsECharRepository.findBySource(source).isPresent();
            case 'f' -> beginsFCharRepository.findBySource(source).isPresent();
            case 'g' -> beginsGCharRepository.findBySource(source).isPresent();
            case 'h' -> beginsHCharRepository.findBySource(source).isPresent();
            case 'i' -> beginsICharRepository.findBySource(source).isPresent();
            case 'j' -> beginsJCharRepository.findBySource(source).isPresent();
            case 'k' -> beginsKCharRepository.findBySource(source).isPresent();
            case 'l' -> beginsLCharRepository.findBySource(source).isPresent();
            case 'm' -> beginsMCharRepository.findBySource(source).isPresent();
            case 'n' -> beginsNCharRepository.findBySource(source).isPresent();
            case 'o' -> beginsOCharRepository.findBySource(source).isPresent();
            case 'p' -> beginsPCharRepository.findBySource(source).isPresent();
            case 'q' -> beginsQCharRepository.findBySource(source).isPresent();
            case 'r' -> beginsRCharRepository.findBySource(source).isPresent();
            case 's' -> beginsSCharRepository.findBySource(source).isPresent();
            case 't' -> beginsTCharRepository.findBySource(source).isPresent();
            case 'u' -> beginsUCharRepository.findBySource(source).isPresent();
            case 'v' -> beginsVCharRepository.findBySource(source).isPresent();
            case 'w' -> beginsWCharRepository.findBySource(source).isPresent();
            case 'x' -> beginsXCharRepository.findBySource(source).isPresent();
            case 'y' -> beginsYCharRepository.findBySource(source).isPresent();
            case 'z' -> beginsZCharRepository.findBySource(source).isPresent();
            default -> false;
        };
    }

    public Page<?> exportDataAsMap(char byStartChar) {
        Pageable pageable = Pageable.ofSize(100_000);
        return switch (byStartChar) {
            case 'a' -> beginsACharRepository.findAll(pageable);
            case 'b' -> beginsBCharRepository.findAll(pageable);
            case 'c' -> beginsCCharRepository.findAll(pageable);
            case 'd' -> beginsDCharRepository.findAll(pageable);
            case 'e' -> beginsECharRepository.findAll(pageable);
            case 'f' -> beginsFCharRepository.findAll(pageable);
            case 'g' -> beginsGCharRepository.findAll(pageable);
            case 'h' -> beginsHCharRepository.findAll(pageable);
            case 'i' -> beginsICharRepository.findAll(pageable);
            case 'j' -> beginsJCharRepository.findAll(pageable);
            case 'k' -> beginsKCharRepository.findAll(pageable);
            case 'l' -> beginsLCharRepository.findAll(pageable);
            case 'm' -> beginsMCharRepository.findAll(pageable);
            case 'n' -> beginsNCharRepository.findAll(pageable);
            case 'o' -> beginsOCharRepository.findAll(pageable);
            case 'p' -> beginsPCharRepository.findAll(pageable);
            case 'q' -> beginsQCharRepository.findAll(pageable);
            case 'r' -> beginsRCharRepository.findAll(pageable);
            case 's' -> beginsSCharRepository.findAll(pageable);
            case 't' -> beginsTCharRepository.findAll(pageable);
            case 'u' -> beginsUCharRepository.findAll(pageable);
            case 'v' -> beginsVCharRepository.findAll(pageable);
            case 'w' -> beginsWCharRepository.findAll(pageable);
            case 'x' -> beginsXCharRepository.findAll(pageable);
            case 'y' -> beginsYCharRepository.findAll(pageable);
            case 'z' -> beginsZCharRepository.findAll(pageable);
            default -> throw new EntityNotFoundException();
        };
    }

    @Override
    public long count() {

        long count = 0;

        count += beginsACharRepository.count();
        count += beginsBCharRepository.count();
        count += beginsCCharRepository.count();
        count += beginsDCharRepository.count();
        count += beginsECharRepository.count();
        count += beginsFCharRepository.count();
        count += beginsGCharRepository.count();
        count += beginsHCharRepository.count();
        count += beginsICharRepository.count();
        count += beginsJCharRepository.count();
        count += beginsKCharRepository.count();
        count += beginsLCharRepository.count();
        count += beginsMCharRepository.count();
        count += beginsNCharRepository.count();
        count += beginsOCharRepository.count();
        count += beginsPCharRepository.count();
        count += beginsQCharRepository.count();
        count += beginsRCharRepository.count();
        count += beginsSCharRepository.count();
        count += beginsTCharRepository.count();
        count += beginsUCharRepository.count();
        count += beginsVCharRepository.count();
        count += beginsWCharRepository.count();
        count += beginsXCharRepository.count();
        count += beginsYCharRepository.count();
        count += beginsZCharRepository.count();

        return count;
    }
}
