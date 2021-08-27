package com.dcps.neosia.model.pojo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.dcps.neosia.model.EntityBase;

@Entity(tableName = "calificaciones",
        foreignKeys = {@ForeignKey(entity = Evaluacion.class,
                                   parentColumns = "id",
                                   childColumns = "evaluacion_id",
                                   onDelete = ForeignKey.CASCADE)}
        )
public class Calificacion extends EntityBase {

    @NonNull
    private double valor;
    @ColumnInfo(name = "evaluacion_id")
    private String evaluacionId;

    public Calificacion() {
        super();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEvaluacionId() {
        return evaluacionId;
    }

    public void setEvaluacionId(String evaluacionId) {
        this.evaluacionId = evaluacionId;
    }
}
