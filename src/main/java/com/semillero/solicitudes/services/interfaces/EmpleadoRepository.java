package com.semillero.solicitudes.services.interfaces;

import com.semillero.solicitudes.persistence.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<EmployeeEntity, Integer> {
}
