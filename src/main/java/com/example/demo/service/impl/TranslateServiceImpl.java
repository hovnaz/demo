package com.example.demo.service.impl;

import com.example.demo.entity.beginsChar.*;
import com.example.demo.repository.beginsChar.*;
import com.example.demo.service.TranslateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
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
        String newSource = source.toLowerCase().replaceAll("\\s+", " ").trim();
        String newTranslation = translation.replaceAll("\\s+", " ").trim();

        if (newSource.length() == 0) {
            return;
        }
        char startingChar = Character.toLowerCase(source.charAt(0));
        switch (startingChar) {
            case 'a' -> {
                Optional<BeginsAChar> bySourceAOptional = beginsACharRepository.findBySource(newSource);
                if (bySourceAOptional.isEmpty()) {
                    BeginsAChar build = BeginsAChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsACharRepository.save(build);
                }
            }
            case 'b' -> {
                Optional<BeginsBChar> bySourceBOptional = beginsBCharRepository.findBySource(newSource);
                if (bySourceBOptional.isEmpty()) {
                    BeginsBChar build = BeginsBChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsBCharRepository.save(build);
                }
            }
            case 'c' -> {
                Optional<BeginsCChar> bySourceCOptional = beginsCCharRepository.findBySource(newSource);
                if (bySourceCOptional.isEmpty()) {
                    BeginsCChar build = BeginsCChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsCCharRepository.save(build);
                }
            }
            case 'd' -> {
                Optional<BeginsDChar> bySourceDOptional = beginsDCharRepository.findBySource(newSource);
                if (bySourceDOptional.isEmpty()) {
                    BeginsDChar build = BeginsDChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsDCharRepository.save(build);
                }
            }
            case 'e' -> {
                Optional<BeginsEChar> bySourceEOptional = beginsECharRepository.findBySource(newSource);
                if (bySourceEOptional.isEmpty()) {
                    BeginsEChar build = BeginsEChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsECharRepository.save(build);
                }
            }
            case 'f' -> {
                Optional<BeginsFChar> bySourceFOptional = beginsFCharRepository.findBySource(newSource);
                if (bySourceFOptional.isEmpty()) {
                    BeginsFChar build = BeginsFChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsFCharRepository.save(build);
                }
            }
            case 'g' -> {
                Optional<BeginsGChar> bySourceGOptional = beginsGCharRepository.findBySource(newSource);
                if (bySourceGOptional.isEmpty()) {
                    BeginsGChar build = BeginsGChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsGCharRepository.save(build);
                }
            }
            case 'h' -> {
                Optional<BeginsHChar> bySourceHOptional = beginsHCharRepository.findBySource(newSource);
                if (bySourceHOptional.isEmpty()) {
                    BeginsHChar build = BeginsHChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsHCharRepository.save(build);
                }
            }
            case 'i' -> {
                Optional<BeginsIChar> bySourceIOptional = beginsICharRepository.findBySource(newSource);
                if (bySourceIOptional.isEmpty()) {
                    BeginsIChar build = BeginsIChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsICharRepository.save(build);
                }
            }
            case 'j' -> {
                Optional<BeginsJChar> bySourceJOptional = beginsJCharRepository.findBySource(newSource);
                if (bySourceJOptional.isEmpty()) {
                    BeginsJChar build = BeginsJChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsJCharRepository.save(build);
                }
            }
            case 'k' -> {
                Optional<BeginsKChar> bySourceKOptional = beginsKCharRepository.findBySource(newSource);
                if (bySourceKOptional.isEmpty()) {
                    BeginsKChar build = BeginsKChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsKCharRepository.save(build);
                }
            }
            case 'l' -> {
                Optional<BeginsLChar> bySourceLOptional = beginsLCharRepository.findBySource(newSource);
                if (bySourceLOptional.isEmpty()) {
                    BeginsLChar build = BeginsLChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsLCharRepository.save(build);
                }
            }
            case 'm' -> {
                Optional<BeginsMChar> bySourceMOptional = beginsMCharRepository.findBySource(newSource);
                if (bySourceMOptional.isEmpty()) {
                    BeginsMChar build = BeginsMChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsMCharRepository.save(build);
                }
            }
            case 'n' -> {
                Optional<BeginsNChar> bySourceNOptional = beginsNCharRepository.findBySource(newSource);
                if (bySourceNOptional.isEmpty()) {
                    BeginsNChar build = BeginsNChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsNCharRepository.save(build);
                }
            }
            case 'o' -> {
                Optional<BeginsOChar> bySourceOOptional = beginsOCharRepository.findBySource(newSource);
                if (bySourceOOptional.isEmpty()) {
                    BeginsOChar build = BeginsOChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsOCharRepository.save(build);
                }
            }
            case 'p' -> {
                Optional<BeginsPChar> bySourcePOptional = beginsPCharRepository.findBySource(newSource);
                if (bySourcePOptional.isEmpty()) {
                    BeginsPChar build = BeginsPChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsPCharRepository.save(build);
                }
            }
            case 'q' -> {
                Optional<BeginsQChar> bySourceQOptional = beginsQCharRepository.findBySource(newSource);
                if (bySourceQOptional.isEmpty()) {
                    BeginsQChar build = BeginsQChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsQCharRepository.save(build);
                }
            }
            case 'r' -> {
                Optional<BeginsRChar> bySourceROptional = beginsRCharRepository.findBySource(newSource);
                if (bySourceROptional.isEmpty()) {
                    BeginsRChar build = BeginsRChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsRCharRepository.save(build);
                }
            }
            case 's' -> {
                Optional<BeginsSChar> bySourceSOptional = beginsSCharRepository.findBySource(newSource);
                if (bySourceSOptional.isEmpty()) {
                    BeginsSChar build = BeginsSChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsSCharRepository.save(build);
                }
            }
            case 't' -> {
                Optional<BeginsTChar> bySourceTOptional = beginsTCharRepository.findBySource(newSource);
                if (bySourceTOptional.isEmpty()) {
                    BeginsTChar build = BeginsTChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsTCharRepository.save(build);
                }
            }
            case 'u' -> {
                Optional<BeginsUChar> bySourceUOptional = beginsUCharRepository.findBySource(newSource);
                if (bySourceUOptional.isEmpty()) {
                    BeginsUChar build = BeginsUChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsUCharRepository.save(build);
                }
            }
            case 'v' -> {
                Optional<BeginsVChar> bySourceVOptional = beginsVCharRepository.findBySource(newSource);
                if (bySourceVOptional.isEmpty()) {
                    BeginsVChar build = BeginsVChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsVCharRepository.save(build);
                }
            }
            case 'w' -> {
                Optional<BeginsWChar> bySourceWOptional = beginsWCharRepository.findBySource(newSource);
                if (bySourceWOptional.isEmpty()) {
                    BeginsWChar build = BeginsWChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsWCharRepository.save(build);
                }
            }
            case 'x' -> {
                Optional<BeginsXChar> bySourceXOptional = beginsXCharRepository.findBySource(newSource);
                if (bySourceXOptional.isEmpty()) {
                    BeginsXChar build = BeginsXChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsXCharRepository.save(build);
                }
            }
            case 'y' -> {
                Optional<BeginsYChar> bySourceYOptional = beginsYCharRepository.findBySource(newSource);
                if (bySourceYOptional.isEmpty()) {
                    BeginsYChar build = BeginsYChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsYCharRepository.save(build);
                }
            }
            case 'z' -> {
                Optional<BeginsZChar> bySourceZOptional = beginsZCharRepository.findBySource(newSource);
                if (bySourceZOptional.isEmpty()) {
                    BeginsZChar build = BeginsZChar.builder()
                            .source(newSource)
                            .translation(newTranslation)
                            .build();
                    beginsZCharRepository.save(build);
                }
            }
        }
    }

    public boolean findBySource(String source) {
        String newSource = source.toLowerCase().replaceAll("\\s+", " ").trim();
        if (newSource.length() == 0) {
            return false;
        }
        char startingChar = Character.toLowerCase(source.charAt(0));
        return switch (startingChar) {
            case 'a' -> beginsACharRepository.findBySource(newSource).isPresent();
            case 'b' -> beginsBCharRepository.findBySource(newSource).isPresent();
            case 'c' -> beginsCCharRepository.findBySource(newSource).isPresent();
            case 'd' -> beginsDCharRepository.findBySource(newSource).isPresent();
            case 'e' -> beginsECharRepository.findBySource(newSource).isPresent();
            case 'f' -> beginsFCharRepository.findBySource(newSource).isPresent();
            case 'g' -> beginsGCharRepository.findBySource(newSource).isPresent();
            case 'h' -> beginsHCharRepository.findBySource(newSource).isPresent();
            case 'i' -> beginsICharRepository.findBySource(newSource).isPresent();
            case 'j' -> beginsJCharRepository.findBySource(newSource).isPresent();
            case 'k' -> beginsKCharRepository.findBySource(newSource).isPresent();
            case 'l' -> beginsLCharRepository.findBySource(newSource).isPresent();
            case 'm' -> beginsMCharRepository.findBySource(newSource).isPresent();
            case 'n' -> beginsNCharRepository.findBySource(newSource).isPresent();
            case 'o' -> beginsOCharRepository.findBySource(newSource).isPresent();
            case 'p' -> beginsPCharRepository.findBySource(newSource).isPresent();
            case 'q' -> beginsQCharRepository.findBySource(newSource).isPresent();
            case 'r' -> beginsRCharRepository.findBySource(newSource).isPresent();
            case 's' -> beginsSCharRepository.findBySource(newSource).isPresent();
            case 't' -> beginsTCharRepository.findBySource(newSource).isPresent();
            case 'u' -> beginsUCharRepository.findBySource(newSource).isPresent();
            case 'v' -> beginsVCharRepository.findBySource(newSource).isPresent();
            case 'w' -> beginsWCharRepository.findBySource(newSource).isPresent();
            case 'x' -> beginsXCharRepository.findBySource(newSource).isPresent();
            case 'y' -> beginsYCharRepository.findBySource(newSource).isPresent();
            case 'z' -> beginsZCharRepository.findBySource(newSource).isPresent();
            default -> false;
        };
    }

    public Map<String, String> exportDataAsMap() {
        Map<String, String> translationMap = new HashMap<>();

        beginsACharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });

        beginsBCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });

        beginsCCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsDCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsECharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsFCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsGCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsHCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsICharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsJCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsKCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsLCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsMCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsNCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsOCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsPCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsQCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsRCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsSCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsTCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsUCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsVCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsWCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsWCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsYCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        beginsZCharRepository.findAll().forEach(item -> {
            translationMap.put(item.getSource(), item.getTranslation());
        });
        return translationMap;
    }
}
