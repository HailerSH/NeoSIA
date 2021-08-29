package com.dcps.neosia.model.pojo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "docentes",
        foreignKeys = {@ForeignKey(entity = Departamento.class,
                                   parentColumns = "id",
                                   childColumns = "departamento_id",
                                   onDelete = ForeignKey.CASCADE)
                       }
        )
public class Docente extends Persona {

    @ColumnInfo(name = "departamento_id")
    private String departamentoId;

    public Docente() {
        super();
    }

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(String departamentoId) {
        this.departamentoId = departamentoId;
    }
}
