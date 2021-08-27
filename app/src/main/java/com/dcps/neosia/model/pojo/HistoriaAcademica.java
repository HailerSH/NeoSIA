package com.dcps.neosia.model.pojo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.dcps.neosia.model.EntityBase;

@Entity(tableName = "historias_academicas",
        foreignKeys = {
            @ForeignKey(entity = PlanDeEstudios.class,
                        parentColumns = "id",
                        childColumns = "plan_de_estudios_id",
                        onDelete = ForeignKey.CASCADE),
            @ForeignKey(entity = Estudiante.class,
                        parentColumns = "id",
                        childColumns = "estudiante_id",
                        onDelete = ForeignKey.CASCADE)
            }
        )
public class HistoriaAcademica extends EntityBase {

    @NonNull
    private String estado;
    @NonNull
    private float porcentajeDeAvance;
    @NonNull
    private int cupoDeCreditos;
    @ColumnInfo(name = "plan_de_estudios_id")
    private String planDeEstudiosId;
    @ColumnInfo(name = "estudiante_id")
    private String estudianteId;

    public HistoriaAcademica() {
        super();
    }

    @NonNull
    public String getEstado() {
        return estado;
    }

    public void setEstado(@NonNull String estado) {
        this.estado = estado;
    }

    public float getPorcentajeDeAvance() {
        return porcentajeDeAvance;
    }

    public void setPorcentajeDeAvance(float porcentajeDeAvance) {
        this.porcentajeDeAvance = porcentajeDeAvance;
    }

    public int getCupoDeCreditos() {
        return cupoDeCreditos;
    }

    public void setCupoDeCreditos(int cupoDeCreditos) {
        this.cupoDeCreditos = cupoDeCreditos;
    }

    public String getPlanDeEstudiosId() {
        return planDeEstudiosId;
    }

    public void setPlanDeEstudiosId(String planDeEstudiosId) {
        this.planDeEstudiosId = planDeEstudiosId;
    }

    public String getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(String estudianteId) {
        this.estudianteId = estudianteId;
    }
}
