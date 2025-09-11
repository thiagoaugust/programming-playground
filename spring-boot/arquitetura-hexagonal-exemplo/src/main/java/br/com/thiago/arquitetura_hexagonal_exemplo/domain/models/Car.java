package br.com.thiago.arquitetura_hexagonal_exemplo.domain.models;

import java.time.LocalDateTime;

public class Car {

    private Long id;
    private String plate;
    private LocalDateTime checkin;
    private LocalDateTime checkout;
    private Double totalBill;

    public Car(String plate) {
        this.plate = plate;
        this.checkin = LocalDateTime.now();
        this.checkout = null;
        this.totalBill = null;
    }

    public Car(Long id, String plate, LocalDateTime checkin, LocalDateTime checkout, Double totalBill) {
        this.id = id;
        this.plate = plate;
        this.checkin = checkin;
        this.checkout = checkout;
        this.totalBill = totalBill;
    }

    public LocalDateTime getCheckin() {
        return checkin;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setCheckin(LocalDateTime checkin) {
        this.checkin = checkin;
    }

    public LocalDateTime getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }

    public Double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(Double totalBill) {
        this.totalBill = totalBill;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
