package com.dcps.neosia.model.pojo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "periodos_academicos",
        foreignKeys = {@ForeignKey(entity = Sede.class,
                                   parentColumns = "id",
                                   childColumns = "sede_id",
                                   onDelete = ForeignKey.CASCADE)
                       }
        )
public class PeriodoAcademico extends PeriodoDeTiempo {

    @NonNull
    private String codigo;
    @NonNull
    @ColumnInfo(name = "sede_id")
    private String sedeId;

    public PeriodoAcademico() {
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
    public String getSedeId() {
        return sedeId;
    }

    public void setSedeId(@NonNull String sedeId) {
        this.sedeId = sedeId;
    }
}
