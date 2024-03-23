package com.semillero.solicitudes.persistence.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "EMPLEADO")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEmpleado")
    private int id;

    @Basic(optional = false)
    @Column(name = "DOCUMENTO")
    private String documento;
    @Basic(optional = false)
    @Column(name = "TIPO DOCUMENTO")
    private String tipo_documento;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "APELLIDO")
    private String apellido;
    @Basic(optional = false)
    @Column(name = "TELEFONO")
    private String telefono;

    @Basic(optional = false)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "FECHA INGRESO")
    private String fecha_ingreso;

    @Basic(optional = false)
    @Column(name = "FECHA RETIRO")
    private String fecha_retiro;

    @Basic(optional = false)
    @Column(name = "TIPO CONTRATO")
    private String tipo_Contrato;
    @Basic(optional = false)
    @Column(name = "ESTADO EMPLEADO")
    private String estado_Empleado;

    @Basic(optional = false)
    @Column(name = "SUPERVISOR INMEDIATO")
    private String supervisor_Inmediato;

    @Basic(optional = false)
    @Column(name = "CARGO")
    private String cargo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_retiro() {
        return fecha_retiro;
    }

    public void setFecha_retiro(String fecha_retiro) {
        this.fecha_retiro = fecha_retiro;
    }

    public String getTipo_Contrato() {
        return tipo_Contrato;
    }

    public void setTipo_Contrato(String tipo_Contrato) {
        this.tipo_Contrato = tipo_Contrato;
    }

    public String getEstado_Empleado() {
        return estado_Empleado;
    }

    public void setEstado_Empleado(String estado_Empleado) {
        this.estado_Empleado = estado_Empleado;
    }

    public String getSupervisor_Inmediato() {
        return supervisor_Inmediato;
    }

    public void setSupervisor_Inmediato(String supervisor_Inmediato) {
        this.supervisor_Inmediato = supervisor_Inmediato;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
