package com.dcps.neosia.model.pojo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "departamentos",
        foreignKeys = {@ForeignKey(entity = Facultad.class,
                                   parentColumns = "id",
                                   childColumns = "facultad_id",
                                   onDelete = ForeignKey.CASCADE)}
        )
public class Departamento extends DivisionAdministrativa {

    @ColumnInfo(name = "facultad_id")
    private String facultadId;

    public Departamento() {
        super();
    }

    public String getFacultadId() {
        return facultadId;
    }

    public void setFacultadId(String facultadId) {
        this.facultadId = facultadId;
    }
}
