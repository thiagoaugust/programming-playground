package br.dev.rasq.conversion.types.google;


import br.dev.rasq.conversion.commons.ConversionHandler;
import br.dev.rasq.conversion.commons.ConversionType;
import br.dev.rasq.conversion.commons.dto.ConversionPayload;
import br.dev.rasq.conversion.commons.dto.ConversionResult;
import org.springframework.stereotype.Component;

@Component
public class GoogleConversionHandler implements ConversionHandler {

    @Override
    public ConversionType type() {
        return ConversionType.GOOGLE;
    }

    @Override
    public ConversionResult sendConversion(ConversionPayload payload) {
        return new ConversionResult(true, "Google OK");
    }
}
