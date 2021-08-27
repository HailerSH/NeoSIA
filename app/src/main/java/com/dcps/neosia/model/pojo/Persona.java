package com.dcps.neosia.model.pojo;

import androidx.annotation.NonNull;
import androidx.room.Entity;

import java.util.Date;

@Entity(tableName = "personas")
public class Persona extends User {

    @NonNull
    private String tipoDeIdentidad;
    @NonNull
    private String identidad;
    @NonNull
    private String primerNombre;
    private String segundoNombre;
    @NonNull
    private String primerApellido;
    @NonNull
    private String segundoApellido;
    private String correoElectronicoPersonal;
    @NonNull
    private String correoElectronicoUniversitario;
    @NonNull
    private Date fechaDeNacimiento;
    @NonNull
    private String tipoDeSangre;
    @NonNull
    private String direccion;

    public Persona() {
        super();
    }

    @NonNull
    public String getTipoDeIdentidad() {
        return tipoDeIdentidad;
    }

    public void setTipoDeIdentidad(@NonNull String tipoDeIdentidad) {
        this.tipoDeIdentidad = tipoDeIdentidad;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    @NonNull
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(@NonNull String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @NonNull
    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(@NonNull String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @NonNull
    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(@NonNull String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCorreoElectronicoPersonal() {
        return correoElectronicoPersonal;
    }

    public void setCorreoElectronicoPersonal(String correoElectronicoPersonal) {
        this.correoElectronicoPersonal = correoElectronicoPersonal;
    }

    @NonNull
    public String getCorreoElectronicoUniversitario() {
        return correoElectronicoUniversitario;
    }

    public void setCorreoElectronicoUniversitario(@NonNull String correoElectronicoUniversitario) {
        this.correoElectronicoUniversitario = correoElectronicoUniversitario;
    }

    @NonNull
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(@NonNull Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @NonNull
    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(@NonNull String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    @NonNull
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(@NonNull String direccion) {
        this.direccion = direccion;
    }
}
