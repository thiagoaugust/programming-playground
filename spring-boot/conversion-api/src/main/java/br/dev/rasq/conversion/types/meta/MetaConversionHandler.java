package br.dev.rasq.conversion.types.meta;


import br.dev.rasq.conversion.commons.Conversion;
import br.dev.rasq.conversion.commons.ConversionType;
import br.dev.rasq.conversion.commons.dto.ConversionPayload;
import br.dev.rasq.conversion.commons.dto.ConversionResult;
import org.springframework.stereotype.Component;

@Component
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