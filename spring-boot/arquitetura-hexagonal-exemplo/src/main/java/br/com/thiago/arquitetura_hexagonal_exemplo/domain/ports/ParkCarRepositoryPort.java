package br.com.thiago.arquitetura_hexagonal_exemplo.domain.ports;

import br.com.thiago.arquitetura_hexagonal_exemplo.domain.models.Car;

public interface ParkCarRepositoryPort {

    void checkin(Car car);

    void checkout(Car car);

    Car findCarByPlate(String plate);
}
