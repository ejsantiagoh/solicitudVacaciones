package com.semillero.solicitudes.services;

import com.semillero.solicitudes.persistence.entities.UserEntity;
import com.semillero.solicitudes.services.interfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity createUser(UserEntity userEntity){
        return userRepository.save(userEntity);
    }

    public List<UserEntity> obtenerTodosUsuarios() {
        return userRepository.findAll();
    }

    public Optional<UserEntity> obtenerUsuarioPorId(int id) {
        return userRepository.findById(id);
    }
    public UserEntity actualizarUsuario(UserEntity usuario) {
        return userRepository.save(usuario);
    }

    public void eliminarUsuarioPorId(int id) {
        userRepository.deleteById(id);
    }
}
