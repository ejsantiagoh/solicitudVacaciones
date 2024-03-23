package com.semillero.solicitudes.services.interfaces;

import com.semillero.solicitudes.persistence.entities.CharguesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargosRepository extends JpaRepository<CharguesEntity, Integer> {
}
