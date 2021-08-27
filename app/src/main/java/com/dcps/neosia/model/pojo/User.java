package com.dcps.neosia.model.pojo;

import androidx.annotation.NonNull;
import androidx.room.Entity;

import com.dcps.neosia.model.EntityBase;

@Entity(tableName = "users")
public class User extends EntityBase {

    @NonNull
    private String username;
    @NonNull
    private String password;
    @NonNull
    private String rol;

    public User() {
        super();
    }

    @NonNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    @NonNull
    public String getRol() {
        return rol;
    }

    public void setRol(@NonNull String rol) {
        this.rol = rol;
    }
}
