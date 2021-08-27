package com.dcps.neosia.model.pojo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.dcps.neosia.model.EntityBase;

@Entity(tableName = "asignaturas_cursadas",
        foreignKeys = {
            @ForeignKey(entity = Grupo.class,
                        parentColumns = "id",
                        childColumns = "grupo_id",
                        onDelete = ForeignKey.CASCADE),
            @ForeignKey(entity = HistoriaAcademica.class,
                        parentColumns = "id",
                        childColumns = "historia_academica_id",
                        onDelete = ForeignKey.CASCADE)
            }
        )
public class AsignaturaCursada extends EntityBase {

    @NonNull
    private String estado;
    @NonNull
    private double notaFinal;
    @ColumnInfo(name = "grupo_id")
    private String grupoId;
    @ColumnInfo(name = "historia_academica_id")
    private String historiaAcademicaId;

    public AsignaturaCursada() {
        super();
    }

    @NonNull
    public String getEstado() {
        return estado;
    }

    public void setEstado(@NonNull String estado) {
        this.estado = estado;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(String grupoId) {
        this.grupoId = grupoId;
    }

    public String getHistoriaAcademicaId() {
        return historiaAcademicaId;
    }

    public void setHistoriaAcademicaId(String historiaAcademicaId) {
        this.historiaAcademicaId = historiaAcademicaId;
    }
}
