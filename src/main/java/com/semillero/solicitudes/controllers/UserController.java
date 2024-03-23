package com.semillero.solicitudes.controllers;

import com.semillero.solicitudes.persistence.entities.UserEntity;
import com.semillero.solicitudes.services.UserService;
import com.semillero.solicitudes.services.interfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private final UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    // Endpoint para crear un usuario
    @PostMapping("/crear")
    public UserEntity crearUsuario(@RequestBody UserEntity userEntity) {
        return userService.createUser(userEntity);
    }

    // Endpoint para obtener un usuario por ID
    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> obtenerUsuarioPorId(@PathVariable int id) {
        Optional<UserEntity> usuario = userService.obtenerUsuarioPorId(id);
        return usuario.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Endpoint para obtener todos los usuarios
    @GetMapping("/todos")
    public List<UserEntity> obtenerTodosUsuarios() {
        return userService.obtenerTodosUsuarios();
    }

    // Endpoint para actualizar un usuario
    @PutMapping("/actualizar")
    public ResponseEntity<UserEntity> actualizarUsuario(@RequestBody UserEntity usuario) {
        if (!userService.obtenerUsuarioPorId(usuario.getId()).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        UserEntity usuarioActualizado = userService.actualizarUsuario(usuario);
        return ResponseEntity.ok(usuarioActualizado);
    }

    // Endpoint para eliminar un usuario por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarUsuarioPorId(@PathVariable int id) {
        if (!userService.obtenerUsuarioPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        userService.eliminarUsuarioPorId(id);
        return ResponseEntity.ok().build();
    }
}
