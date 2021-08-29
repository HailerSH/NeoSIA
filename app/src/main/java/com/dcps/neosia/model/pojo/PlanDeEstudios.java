package com.dcps.neosia.model.pojo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.dcps.neosia.model.EntityBase;

@Entity(tableName = "planes_de_estudios",
        foreignKeys = {@ForeignKey(entity = ProgramaAcademico.class,
                                   parentColumns = "id",
                                   childColumns = "programa_academico_id",
                                   onDelete = ForeignKey.CASCADE)
                       }
        )
public class PlanDeEstudios extends EntityBase {

    @NonNull
    private String codigo;
    @ColumnInfo(name = "programa_academico_id")
    private String programaAcademicoId;

    public PlanDeEstudios() {
        super();
    }

    @NonNull
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(@NonNull String codigo) {
        this.codigo = codigo;
    }

    public String getProgramaAcademicoId() {
        return programaAcademicoId;
    }

    public void setProgramaAcademicoId(String programaAcademicoId) {
        this.programaAcademicoId = programaAcademicoId;
    }
}
