package com.dcps.neosia.model.pojo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.dcps.neosia.model.EntityBase;

@Entity(tableName = "asignaturas_en_curso",
        foreignKeys = {@ForeignKey(entity = Grupo.class,
                                   parentColumns = "id",
                                   childColumns = "grupo_id",
                                   onDelete = ForeignKey.CASCADE),
                       @ForeignKey(entity = Estudiante.class,
                                   parentColumns = "id",
                                   childColumns = "estudiante_id",
                                   onDelete = ForeignKey.CASCADE)
                       }
        )
public class AsignaturaEnCurso extends EntityBase {

    @ColumnInfo(name = "grupo_id")
    private String grupoId;
    @ColumnInfo(name = "estudiante_id")
    private String estudianteId;

    public AsignaturaEnCurso() {
        super();
    }

    public String getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(String grupoId) {
        this.grupoId = grupoId;
    }

    public String getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(String estudianteId) {
        this.estudianteId = estudianteId;
    }
}
