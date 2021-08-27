package com.dcps.neosia.model.pojo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.dcps.neosia.model.EntityBase;

@Entity(tableName = "grupos",
        foreignKeys = {
            @ForeignKey(entity = Asignatura.class,
                        parentColumns = "id",
                        childColumns = "asignatura_id",
                        onDelete = ForeignKey.CASCADE),
            @ForeignKey(entity = Docente.class,
                        parentColumns = "id",
                        childColumns = "docente_id",
                        onDelete = ForeignKey.CASCADE)
            }
        )
public class Grupo extends EntityBase {

    @NonNull
    private String identificador;
    @ColumnInfo(name = "asignatura_id")
    private String asignaturaId;
    @ColumnInfo(name = "docente_id")
    private String docenteId;

    public Grupo() {
        super();
    }

    @NonNull
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(@NonNull String identificador) {
        this.identificador = identificador;
    }

    public String getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(String asignaturaId) {
        this.asignaturaId = asignaturaId;
    }

    public String getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(String docenteId) {
        this.docenteId = docenteId;
    }
}
