package com.dcps.neosia.model.pojo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.dcps.neosia.model.EntityBase;

@Entity(tableName = "requisitos_de_asignatura",
        foreignKeys = {@ForeignKey(entity = PlanDeEstudios.class,
                       parentColumns = "id",
                       childColumns = "plan_de_estudios_id",
                       onDelete = ForeignKey.CASCADE)}
        )
public class RequisitoDeAsignatura extends EntityBase {

    @ColumnInfo(name = "plan_de_estudios_id")
    private String planDeEstudiosId;

    public RequisitoDeAsignatura() {
        super();
    }

    public String getPlanDeEstudiosId() {
        return planDeEstudiosId;
    }

    public void setPlanDeEstudiosId(String planDeEstudiosId) {
        this.planDeEstudiosId = planDeEstudiosId;
    }
}
