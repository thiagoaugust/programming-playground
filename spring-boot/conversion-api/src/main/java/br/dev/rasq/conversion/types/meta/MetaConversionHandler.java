package br.dev.rasq.conversion.types.meta;


import br.dev.rasq.conversion.commons.ConversionHandler;
import br.dev.rasq.conversion.commons.ConversionType;
import br.dev.rasq.conversion.commons.dto.ConversionPayload;
import br.dev.rasq.conversion.commons.dto.ConversionResult;
import org.springframework.stereotype.Component;

@Component
public class MetaConversionHandler implements ConversionHandler {

    @Override
    public ConversionType type() {
        return ConversionType.META;
    }

    @Override
    public ConversionResult sendConversion(ConversionPayload payload) {
        return new ConversionResult(true, "Meta OK");
    }
}