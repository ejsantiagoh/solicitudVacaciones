package com.semillero.solicitudes.persistence.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "ALERTA")
public class AlertEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAlerta")
    private int id;

    @Basic(optional = false)
    @Column(name = "ASUNTO")
    private String asunto;
    @Basic(optional = false)
    @Column(name = "DESTINATARIO")
    private String destinatario;
    @Basic(optional = false)
    @Column(name = "CONTENIDO ALERTA")
    private String contenido_alerta;
    @Basic(optional = false)
    @Column(name = "ESTADO ALERTA")
    private String estado_alerta;
    @Basic(optional = false)
    @Column(name = "FECHA CREACION")
    private String fecha_creacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getContenido_alerta() {
        return contenido_alerta;
    }

    public void setContenido_alerta(String contenido_alerta) {
        this.contenido_alerta = contenido_alerta;
    }

    public String getEstado_alerta() {
        return estado_alerta;
    }

    public void setEstado_alerta(String estado_alerta) {
        this.estado_alerta = estado_alerta;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}
