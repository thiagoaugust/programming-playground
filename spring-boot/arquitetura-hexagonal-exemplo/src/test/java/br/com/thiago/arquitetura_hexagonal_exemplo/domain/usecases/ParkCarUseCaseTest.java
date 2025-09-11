package br.com.thiago.arquitetura_hexagonal_exemplo.domain.usecases;

import br.com.thiago.arquitetura_hexagonal_exemplo.domain.models.Car;
import br.com.thiago.arquitetura_hexagonal_exemplo.domain.ports.ParkCarRepositoryPort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ParkCarUseCaseTest {

    @Mock
    private ParkCarRepositoryPort parkCarRepositoryPort;

    @InjectMocks
    private ParkCarUseCase parkCarUseCase;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    @DisplayName("Deve realizar um ckeckin")
    public void testCheckin() {

        String plate = "ABC1234";
        ArgumentCaptor<Car> carCaptor = ArgumentCaptor.forClass(Car.class);

        parkCarUseCase.checkin(plate);

        verify(parkCarRepositoryPort, times(1)).checkin(carCaptor.capture());
        Car capturedCar = carCaptor.getValue();
        assertEquals(plate, capturedCar.getPlate());
    }

    @Test
    @DisplayName("Deve realizar um checkout após 2h totalizando R$20,00 de cobrança")
    public void testCheckout() {

        String plate = "ABC1234";
        Car car = new Car(plate);
        car.setCheckin(LocalDateTime.now().minusHours(2));
        when(parkCarRepositoryPort.findCarByPlate(plate)).thenReturn(car);

        parkCarUseCase.checkout(plate);

        verify(parkCarRepositoryPort, times(1)).findCarByPlate(plate);
        verify(parkCarRepositoryPort, times(1)).checkout(car);
        assertEquals(20.0, car.getTotalBill());
    }

    @Test
    @DisplayName("Deve realizar um checkin e checkout em dias diferentes")
    public void testCheckoutSomeDays() {

        String plate = "ABC1234";
        Car carDayOne = new Car(plate);
        carDayOne.setCheckin(LocalDateTime.now().minusHours(2));
        when(parkCarRepositoryPort.findCarByPlate(plate)).thenReturn(carDayOne);
        parkCarUseCase.checkout(plate);

        Car carDayTwo = new Car(plate);
        carDayTwo.setCheckin(LocalDateTime.now().minusHours(8));
        when(parkCarRepositoryPort.findCarByPlate(plate)).thenReturn(carDayTwo);
        parkCarUseCase.checkout(plate);

        verify(parkCarRepositoryPort, times(2)).findCarByPlate(plate);
        verify(parkCarRepositoryPort, times(1)).checkout(carDayOne);
        verify(parkCarRepositoryPort, times(1)).checkout(carDayTwo);
        assertEquals(20.0, carDayOne.getTotalBill());
        assertEquals(80.0, carDayTwo.getTotalBill());
    }
}