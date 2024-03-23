package com.semillero.solicitudes.persistence.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "ROL")
public class RolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRol")
    private int id;

    @Basic(optional = false)
    @Column(name = "ROL")
    private String rol;
    @Basic(optional = false)
    @Column(name = "FECHA CREACION")
    private String fecha_Creacion;

}
