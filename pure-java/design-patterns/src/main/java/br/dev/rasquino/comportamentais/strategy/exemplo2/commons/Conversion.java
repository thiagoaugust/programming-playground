package br.dev.rasquino.comportamentais.strategy.exemplo2.commons;

import br.dev.rasquino.comportamentais.strategy.exemplo2.commons.dto.ConversionPayload;
import br.dev.rasquino.comportamentais.strategy.exemplo2.commons.dto.ConversionResult;

public interface Conversion {
    ConversionType type();
    ConversionResult sendConversion(ConversionPayload payload);
}
