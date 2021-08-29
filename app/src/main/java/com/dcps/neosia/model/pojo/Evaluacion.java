package com.dcps.neosia.model.pojo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.dcps.neosia.model.EntityBase;

@Entity(tableName = "evaluaciones",
        foreignKeys = {@ForeignKey(entity = Grupo.class,
                                   parentColumns = "id",
                                   childColumns = "grupo_id",
                                   onDelete = ForeignKey.CASCADE)
                      }
        )
public class Evaluacion extends EntityBase {

    @NonNull
    private String nombre;
    @NonNull
    private double porcentaje;
    @ColumnInfo(name = "grupo_id")
    private String grupoId;

    public Evaluacion() {
        super();
    }

    @NonNull
    public String getNombre() {
        return nombre;
    }

    public void setNombre(@NonNull String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(String grupoId) {
        this.grupoId = grupoId;
    }
}
