package com.dcps.neosia.model;

import androidx.annotation.NonNull;
import androidx.room.PrimaryKey;

import java.util.UUID;

public class EntityBase {

    @PrimaryKey
    @NonNull
    private String id;

    public EntityBase() {
        this.id = UUID.randomUUID().toString();
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }
}
