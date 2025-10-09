package br.dev.rasquino.comportamentais.strategy.exemplo2.commons.dto;

import java.math.BigDecimal;
import java.util.Map;

public record ConversionPayload(
        String eventId,
        String currency,
        BigDecimal value,
        Map<String, Object> attributes
) {}
