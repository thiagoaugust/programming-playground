package br.dev.rasq.conversion.commons.service;

import br.dev.rasq.conversion.commons.ConversionHandler;
import br.dev.rasq.conversion.commons.ConversionType;
import br.dev.rasq.conversion.commons.dto.ConversionPayload;
import br.dev.rasq.conversion.commons.dto.ConversionResult;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ConversionOrchestrator {

    private final Map<ConversionType, ConversionHandler> conversions;


    public ConversionOrchestrator(List<ConversionHandler> strategies) {
        Map<ConversionType, ConversionHandler> map = new HashMap<>();
        for (ConversionHandler strategy : strategies) {
            map.put(strategy.type(), strategy);
        }
        this.conversions = Collections.unmodifiableMap(map);
    }

    /** Uma forma mais "moderna" de fazer o mesmo que o código acima
    public ConversionOrchestrator(List<Conversion> strategies) {
        this.conversions = strategies.stream()
                .collect(Collectors.toUnmodifiableMap(Conversion::type, Function.identity()));
    }*/

    public ConversionResult send(ConversionType type, ConversionPayload payload) {
        var strategy = Optional.ofNullable(conversions.get(type))
                .orElseThrow(() -> new IllegalArgumentException("Conversion type not supported: " + type));
        return strategy.sendConversion(payload);
    }
}
