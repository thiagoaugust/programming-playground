package br.com.thiago.arquitetura_hexagonal_exemplo.config;

import br.com.thiago.arquitetura_hexagonal_exemplo.adapters.controllers.ParkCarController;
import br.com.thiago.arquitetura_hexagonal_exemplo.adapters.repositories.ParkCarRepository;
import br.com.thiago.arquitetura_hexagonal_exemplo.adapters.repositories.SpringParkCarRepository;
import br.com.thiago.arquitetura_hexagonal_exemplo.domain.ports.ParkCarRepositoryPort;
import br.com.thiago.arquitetura_hexagonal_exemplo.domain.ports.ParkCarUseCasePort;
import br.com.thiago.arquitetura_hexagonal_exemplo.domain.usecases.ParkCarUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParkCarBeanConfig {

    @Bean
    public ParkCarController parkCarController(ParkCarUseCasePort parkCarPort) {
        return new ParkCarController(parkCarPort);
    }
    @Bean
    public ParkCarUseCase parkCarUseCase(ParkCarRepositoryPort parkCarRepositoryPort) {
        return new ParkCarUseCase(parkCarRepositoryPort);
    }

    @Bean
    public ParkCarRepository parkCarRepository(SpringParkCarRepository springParkCarRepository) {
        return new ParkCarRepository(springParkCarRepository);
    }
}
