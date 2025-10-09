package br.dev.rasq.conversion.commons.dto;

import br.dev.rasq.conversion.commons.ConversionType;

import java.util.Map;

public record ConversionPayload(
        ConversionType type,
        String eventId,
        int value,
        String email,
        String phone,
        String protocol,
        Map<String, Object> attributes
) {}
