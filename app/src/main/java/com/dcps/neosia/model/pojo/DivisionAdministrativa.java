package com.dcps.neosia.model.pojo;

import androidx.annotation.NonNull;
import androidx.room.Entity;

import com.dcps.neosia.model.EntityBase;

@Entity(tableName = "divisiones_administrativas")
public class DivisionAdministrativa extends EntityBase {

    @NonNull
    private String codigo;
    @NonNull
    private String nombre;

    public DivisionAdministrativa() {
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
    public String getNombre() {
        return nombre;
    }

    public void setNombre(@NonNull String nombre) {
        this.nombre = nombre;
    }
}
