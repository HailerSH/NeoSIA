package com.dcps.neosia.model.pojo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.dcps.neosia.model.EntityBase;

@Entity(tableName = "asignaturas",
        foreignKeys = {
            @ForeignKey(entity = PeriodoAcademico.class,
                        parentColumns = "id",
                        childColumns = "periodo_academico_id",
                        onDelete = ForeignKey.CASCADE),
            @ForeignKey(entity = AreaCurricular.class,
                        parentColumns = "id",
                        childColumns = "area_curricular_id",
                        onDelete = ForeignKey.CASCADE)}
        )
public class Asignatura extends EntityBase {

    @NonNull
    private String codigo;
    @NonNull
    private String nombre;
    @NonNull
    private String descripcion;
    @NonNull
    private int requisitoDeCreditos;
    @ColumnInfo(name = "periodo_academico_id")
    private String periodoAcademicoId;
    @ColumnInfo(name = "area_curricular_id")
    private String areaCurricularId;

    public Asignatura() {
        super();
    }

    @NonNull
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(@NonNull String codigo) {
        this.codigo = codigo;
    }

    @NonNull
    public String getNombre() {
        return nombre;
    }

    public void setNombre(@NonNull String nombre) {
        this.nombre = nombre;
    }

    @NonNull
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(@NonNull String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRequisitoDeCreditos() {
        return requisitoDeCreditos;
    }

    public void setRequisitoDeCreditos(int requisitoDeCreditos) {
        this.requisitoDeCreditos = requisitoDeCreditos;
    }

    public String getPeriodoAcademicoId() {
        return periodoAcademicoId;
    }

    public void setPeriodoAcademicoId(String periodoAcademicoId) {
        this.periodoAcademicoId = periodoAcademicoId;
    }

    public String getAreaCurricularId() {
        return areaCurricularId;
    }

    public void setAreaCurricularId(String areaCurricularId) {
        this.areaCurricularId = areaCurricularId;
    }
}
