package com.dcps.neosia.model.pojo;

import androidx.annotation.NonNull;
import androidx.room.Entity;

import com.dcps.neosia.model.EntityBase;

import java.util.Date;

@Entity(tableName = "periodos_de_tiempo")
public class PeriodoDeTiempo extends EntityBase {

    @NonNull
    private Date fechaDeInicio;
    @NonNull
    private Date fechaDeFinalizacion;

    public PeriodoDeTiempo() {
        super();
    }

    @NonNull
    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(@NonNull Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    @NonNull
    public Date getFechaDeFinalizacion() {
        return fechaDeFinalizacion;
    }

    public void setFechaDeFinalizacion(@NonNull Date fechaDeFinalizacion) {
        this.fechaDeFinalizacion = fechaDeFinalizacion;
    }
}
