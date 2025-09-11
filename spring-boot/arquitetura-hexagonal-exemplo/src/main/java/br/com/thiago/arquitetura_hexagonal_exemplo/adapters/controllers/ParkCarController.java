package br.com.thiago.arquitetura_hexagonal_exemplo.adapters.controllers;

import br.com.thiago.arquitetura_hexagonal_exemplo.domain.ports.ParkCarUseCasePort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parkcars")
public class ParkCarController {

    private final ParkCarUseCasePort parkCarUseCasePort;

    public ParkCarController(ParkCarUseCasePort parkCarUseCasePort) {
        this.parkCarUseCasePort = parkCarUseCasePort;
    }

    @PostMapping("/checkin")
    public ResponseEntity<Void> checkin(@RequestParam String plate){
        parkCarUseCasePort.checkin(plate);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/checkout")
    public ResponseEntity<Void> checkout(@RequestParam String plate){
        parkCarUseCasePort.checkout(plate);
        return ResponseEntity.ok().build();
    }
}
