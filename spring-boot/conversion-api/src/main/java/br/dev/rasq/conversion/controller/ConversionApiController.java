package br.dev.rasq.conversion.controller;

import br.dev.rasq.conversion.commons.ConversionType;
import br.dev.rasq.conversion.commons.dto.ConversionPayload;
import br.dev.rasq.conversion.commons.dto.ConversionResult;
import br.dev.rasq.conversion.commons.service.ConversionOrchestrator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conversion")
@RequiredArgsConstructor
public class ConversionApiController {

    private final ConversionOrchestrator orchestrator;

    @PostMapping("/{type}")
    public ResponseEntity<ConversionResult> convert(
            @RequestBody ConversionPayload payload) {
        return ResponseEntity.ok(orchestrator.send(payload.type(), payload));
    }
}
