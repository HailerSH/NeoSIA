package com.dcps.neosia.model.pojo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "facultades",
        foreignKeys = {@ForeignKey(entity = Sede.class,
                                   parentColumns = "id",
                                   childColumns = "sede_id",
                                   onDelete = ForeignKey.CASCADE)}
        )
public class Facultad extends DivisionAdministrativa {

    @ColumnInfo(name = "sede_id")
    private String sedeId;

    public Facultad() {
        super();
    }

    public String getSedeId() {
        return sedeId;
    }

    public void setSedeId(String sedeId) {
        this.sedeId = sedeId;
    }
}
