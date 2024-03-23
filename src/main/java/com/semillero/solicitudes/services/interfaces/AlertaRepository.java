package com.semillero.solicitudes.services.interfaces;

import com.semillero.solicitudes.persistence.entities.AlertEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertaRepository extends JpaRepository<AlertEntity, Integer> {
}
