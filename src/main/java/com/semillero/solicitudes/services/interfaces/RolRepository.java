package com.semillero.solicitudes.services.interfaces;

import com.semillero.solicitudes.persistence.entities.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<RolEntity, Integer> {
}
