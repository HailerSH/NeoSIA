package com.dcps.neosia.model.pojo;

import androidx.room.Entity;

@Entity(tableName = "estudiantes")
public class Estudiante extends Persona {
    public Estudiante() {
        super();
    }
}
