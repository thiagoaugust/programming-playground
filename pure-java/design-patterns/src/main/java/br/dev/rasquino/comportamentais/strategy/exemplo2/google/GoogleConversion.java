package br.dev.rasquino.comportamentais.strategy.exemplo2.google;

import br.dev.rasquino.comportamentais.strategy.exemplo2.commons.Conversion;
import br.dev.rasquino.comportamentais.strategy.exemplo2.commons.ConversionType;
import br.dev.rasquino.comportamentais.strategy.exemplo2.commons.dto.ConversionPayload;
import br.dev.rasquino.comportamentais.strategy.exemplo2.commons.dto.ConversionResult;

public class GoogleAdsConversion implements Conversion {

    @Override
    public ConversionType type() {
        return null;
    }

    @Override
    public ConversionResult sendConversion(ConversionPayload payload) {
        return null;
    }
}
