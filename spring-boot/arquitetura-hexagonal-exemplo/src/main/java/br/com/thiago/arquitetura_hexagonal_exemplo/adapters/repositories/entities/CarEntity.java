package br.com.thiago.arquitetura_hexagonal_exemplo.adapters.repositories.entities;

import br.com.thiago.arquitetura_hexagonal_exemplo.domain.models.Car;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "ParkedCars")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class CarEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String plate;
    private LocalDateTime checkin;
    private LocalDateTime checkout;
    private Double totalBill;

    public CarEntity(Car car) {
        this.id = car.getId();
        this.plate = car.getPlate();
        this.checkin = car.getCheckin();
        this.checkout = car.getCheckout();
        this.totalBill = car.getTotalBill();
    }

    public Car toCar() {
        return new Car(this.id, this.plate, this.checkin, this.checkout, this.totalBill);
    }
}
