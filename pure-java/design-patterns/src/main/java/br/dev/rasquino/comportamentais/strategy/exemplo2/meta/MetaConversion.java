package br.dev.rasquino.comportamentais.strategy.exemplo2.meta;

import br.dev.rasquino.comportamentais.strategy.exemplo2.commons.Conversion;
import br.dev.rasquino.comportamentais.strategy.exemplo2.commons.ConversionType;
import br.dev.rasquino.comportamentais.strategy.exemplo2.commons.dto.ConversionPayload;
import br.dev.rasquino.comportamentais.strategy.exemplo2.commons.dto.ConversionResult;

public class MetaConversion  implements Conversion {

    @Override
    public ConversionType type() {
        return ConversionType.META;
    }

    @Override
    public ConversionResult sendConversion(ConversionPayload payload) {
        return new ConversionResult(true, "Meta OK");
    }
}