package br.dev.rasq.conversion.types.meta;

public record MetaAttributes(
        String fbp,
        String fbc,
        String externalId,          // seu id interno (hash recomendado)
        String source,              // ex: "whatsapp", "lp"
        String eventSourceUrl,      // página de origem (se houver)
        String clientUserAgent,     // UA do cliente
        String clientIpAddress      // IP do cliente
) {}
