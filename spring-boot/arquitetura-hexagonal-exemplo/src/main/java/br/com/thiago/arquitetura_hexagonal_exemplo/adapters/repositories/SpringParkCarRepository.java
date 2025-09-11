package br.com.thiago.arquitetura_hexagonal_exemplo.adapters.repositories;

import br.com.thiago.arquitetura_hexagonal_exemplo.adapters.repositories.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringParkCarRepository extends JpaRepository<CarEntity, Long> {

    List<CarEntity> findByPlateAndCheckoutIsNull(String plate);
}
