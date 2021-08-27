package com.dcps.neosia.model.pojo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.dcps.neosia.model.EntityBase;

@Entity(tableName = "programas_academicos",
        foreignKeys = {@ForeignKey(entity = AreaCurricular.class,
                parentColumns = "id",
                childColumns = "area_curricular_id",
                onDelete = ForeignKey.CASCADE)}
        )
public class ProgramaAcademico extends EntityBase {

    @NonNull
    private String codigo;
    @NonNull
    private String nombre;
    @NonNull
    private String tipo;
    @ColumnInfo(name = "area_curricular_id")
    private String areaCurricularId;

    public ProgramaAcademico() {
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
    public String getTipo() {
        return tipo;
    }

    public void setTipo(@NonNull String tipo) {
        this.tipo = tipo;
    }

    public String getAreaCurricularId() {
        return areaCurricularId;
    }

    public void setAreaCurricularId(String areaCurricularId) {
        this.areaCurricularId = areaCurricularId;
    }
}
