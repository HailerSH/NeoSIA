package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.Calificacion;

import java.util.List;

@Dao
public interface CalificacionRoomDAO {

    @Query("SELECT * FROM calificaciones")
    List<Calificacion> getAll();

    @Query("SELECT * FROM calificaciones WHERE id = :id")
    List<Calificacion> getById(String id);

    @Insert
    void insertMany(Calificacion ... calificaciones);
    @Insert
    void insertOne(Calificacion calificacion);

    @Update
    void updateAll(Calificacion... calificaciones);
    @Update
    void updateList(List<Calificacion> calificaciones);
    @Update
    void updateOne(Calificacion calificacion);

    @Delete
    void deleteMany(Calificacion ... calificaciones);
    @Query("DELETE FROM calificaciones WHERE id = :id")
    void deleteById(String id);
}
