package br.dev.rasq.conversion.types.google;

public record GoogleAttributes(
        String gclid,
        String conversionLabel,     // se usar a API que exige label
        String transactionId,       // idempotência/dedupe
        String userAgent,           // opcional (server-side hints)
        String ipAddress            // opcional
) {}
