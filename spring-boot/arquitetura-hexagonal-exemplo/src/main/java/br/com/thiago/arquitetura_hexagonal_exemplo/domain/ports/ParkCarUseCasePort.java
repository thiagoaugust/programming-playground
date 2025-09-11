package br.com.thiago.arquitetura_hexagonal_exemplo.domain.ports;

public interface ParkCarUseCasePort {

    void checkin(String plate);
    void checkout(String plate);
}
