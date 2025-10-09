package br.dev.rasq.conversion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversion")
@RequiredArgsConstructor
public class ConversionApiController {

    private final ConversionOrchestrator orchestrator;

    @PostMapping("/{type}")
    public ResponseEntity<ConversionResult> convert(
            @PathVariable ConversionType type,
            @RequestBody ConversionPayload payload) {
        return ResponseEntity.ok(orchestrator.send(type, payload));
    }
}
