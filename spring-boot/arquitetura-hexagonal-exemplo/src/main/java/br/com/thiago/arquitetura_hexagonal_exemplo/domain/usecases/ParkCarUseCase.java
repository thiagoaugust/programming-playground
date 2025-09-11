package br.com.thiago.arquitetura_hexagonal_exemplo.domain.usecases;

import br.com.thiago.arquitetura_hexagonal_exemplo.domain.models.Car;
import br.com.thiago.arquitetura_hexagonal_exemplo.domain.ports.ParkCarRepositoryPort;
import br.com.thiago.arquitetura_hexagonal_exemplo.domain.ports.ParkCarUseCasePort;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ParkCarUseCase implements ParkCarUseCasePort {

    private static final Double PRICE = 10.0;

    private final ParkCarRepositoryPort parkCarRepositoryPort;

    public ParkCarUseCase(ParkCarRepositoryPort parkCarRepositoryPort) {
        this.parkCarRepositoryPort = parkCarRepositoryPort;
    }

    @Override
    public void checkin(String plate){
        Car car = new Car(plate);
        parkCarRepositoryPort.checkin(car);
        System.out.println("Registrando carro.");
        System.out.println("Horário de entrada: " + car.getCheckin());
    }

    @Override
    public void checkout(String plate){
        final Car carByPlate = parkCarRepositoryPort.findCarByPlate(plate);
        Double bill = calculateBill(carByPlate);
        carByPlate.setTotalBill(bill);
        parkCarRepositoryPort.checkout(carByPlate);
    }

    private Double calculateBill(Car car){
        car.setCheckout(LocalDateTime.now());
        long totalHours = ChronoUnit.HOURS.between(car.getCheckin(), car.getCheckout());
        return PRICE * totalHours;
    }
}
