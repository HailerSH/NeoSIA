package com.dcps.neosia.model.pojo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "citaciones",
        foreignKeys = {@ForeignKey(entity = Estudiante.class,
                                   parentColumns = "id",
                                   childColumns = "estudiante_id",
                                   onDelete = ForeignKey.CASCADE)
                       }
        )
public class Citacion extends PeriodoDeTiempo {

    @NonNull
    private String tipo;
    @NonNull
    @ColumnInfo(name = "estudiante_id")
    private String estudianteId;

    public Citacion() {
        super();
    }

    @NonNull
    public String getTipo() {
        return tipo;
    }

    public void setTipo(@NonNull String tipo) {
        this.tipo = tipo;
    }

    @NonNull
    public String getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(@NonNull String estudianteId) {
        this.estudianteId = estudianteId;
    }
}