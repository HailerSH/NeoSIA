package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.Asignatura;

import java.util.List;

@Dao
public interface AsignaturaRoomDAO {

    @Query("SELECT * FROM asignaturas")
    List<Asignatura> getAll();

    @Query("SELECT * FROM asignaturas WHERE id = :id")
    List<Asignatura> getById(String id);

    @Insert
    void insertMany(Asignatura ... asignaturas);
    @Insert
    void insertOne(Asignatura asignatura);

    @Update
    void updateAll(Asignatura ... asignaturas);
    @Update
    void updateList(List<Asignatura> asignaturas);
    @Update
    void updateOne(Asignatura asignatura);

    @Delete
    void deleteMany(Asignatura... asignaturas);
    @Query("DELETE FROM asignaturas WHERE id = :id")
    void deleteById(String id);
}
