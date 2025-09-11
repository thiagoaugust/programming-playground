package br.com.thiago.arquitetura_hexagonal_exemplo.adapters.repositories;

import br.com.thiago.arquitetura_hexagonal_exemplo.adapters.repositories.entities.CarEntity;
import br.com.thiago.arquitetura_hexagonal_exemplo.domain.models.Car;
import br.com.thiago.arquitetura_hexagonal_exemplo.domain.ports.ParkCarRepositoryPort;

import java.util.List;

public class ParkCarRepository implements ParkCarRepositoryPort {

    private final SpringParkCarRepository repository;

    public ParkCarRepository(SpringParkCarRepository repository) {
        this.repository = repository;
    }

    @Override
    public void checkin(Car car) {
        CarEntity entity = new CarEntity(car);
        repository.save(entity);
    }

    @Override
    public void checkout(Car car) {
        CarEntity entity = new CarEntity(car);
        repository.save(entity);
    }

    @Override
    public Car findCarByPlate(String plate) {
        List<CarEntity> carsEntity = repository.findByPlateAndCheckoutIsNull(plate);
        if(carsEntity.size()==1){
            CarEntity carEntity = carsEntity.get(0);
            return carEntity.toCar();
        }
        return null;
    }
}
