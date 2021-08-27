package com.dcps.neosia.model.pojo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.dcps.neosia.model.EntityBase;

@Entity(tableName = "requisitos_de_asignatura",
        foreignKeys = {@ForeignKey(entity = PlanDeEstudios.class,
                                   parentColumns = "id",
                                   childColumns = "plan_de_estudios_id",
                                   onDelete = ForeignKey.CASCADE),
                       @ForeignKey(entity = Asignatura.class,
                                   parentColumns = "id",
                                   childColumns = "asignatura_id",
                                   onDelete = ForeignKey.CASCADE)}
        )
public class RequisitoDeAsignatura extends EntityBase {

    @ColumnInfo(name = "plan_de_estudios_id")
    private String planDeEstudiosId;
    @ColumnInfo(name = "asignatura_id")
    private String asignaturaId;

    public RequisitoDeAsignatura() {
        super();
    }

    public String getPlanDeEstudiosId() {
        return planDeEstudiosId;
    }

    public void setPlanDeEstudiosId(String planDeEstudiosId) {
        this.planDeEstudiosId = planDeEstudiosId;
    }

    public String getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(String asignaturaId) {
        this.asignaturaId = asignaturaId;
    }
}
