package com.dcps.neosia.model.pojo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "areas_curriculares",
        foreignKeys = {@ForeignKey(entity = Departamento.class,
                                   parentColumns = "id",
                                   childColumns = "departamento_id",
                                   onDelete = ForeignKey.CASCADE)}
        )
public class AreaCurricular extends DivisionAdministrativa {

    @ColumnInfo(name = "departamento_id")
    private String departamentoId;

    public AreaCurricular() {
        super();
    }

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(String departamentoId) {
        this.departamentoId = departamentoId;
    }
}
