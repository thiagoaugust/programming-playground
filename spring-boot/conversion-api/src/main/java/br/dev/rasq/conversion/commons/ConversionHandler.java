package br.dev.rasq.conversion.commons;


import br.dev.rasq.conversion.commons.dto.ConversionPayload;
import br.dev.rasq.conversion.commons.dto.ConversionResult;

public interface Conversion {
    ConversionType type();
    ConversionResult sendConversion(ConversionPayload payload);
}
