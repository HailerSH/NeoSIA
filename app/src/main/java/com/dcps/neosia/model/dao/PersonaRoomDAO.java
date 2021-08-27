package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.Docente;
import com.dcps.neosia.model.pojo.Persona;

import java.util.List;

@Dao
public interface PersonaRoomDAO {

    @Query("SELECT * FROM personas")
    List<Persona> getAll();

    @Query("SELECT * FROM personas WHERE id = :id")
    List<Persona> getById(String id);

    @Query("SELECT * FROM personas WHERE identidad = :identidad")
    List<Persona> getByIdentidad(String identidad);

    @Insert
    void insertMany(Persona ... personas);
    @Insert
    void insertOne(Persona persona);

    @Update
    void updateAll(Persona ... personas);
    @Update
    void updateList(List<Persona> personas);
    @Update
    void updateOne(Persona persona);

    @Delete
    void deleteMany(Persona ... personas);
    @Query("DELETE FROM personas WHERE id = :id")
    void deleteById(String id);
}
