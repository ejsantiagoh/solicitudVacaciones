package com.semillero.solicitudes.services.interfaces;

import com.semillero.solicitudes.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    List<UserEntity> getAll();
}
