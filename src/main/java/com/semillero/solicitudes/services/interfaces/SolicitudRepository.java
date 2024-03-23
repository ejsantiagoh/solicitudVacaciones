package com.semillero.solicitudes.services.interfaces;

import com.semillero.solicitudes.persistence.entities.SolicitudEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudRepository extends JpaRepository<SolicitudEntity, Integer>{

}
