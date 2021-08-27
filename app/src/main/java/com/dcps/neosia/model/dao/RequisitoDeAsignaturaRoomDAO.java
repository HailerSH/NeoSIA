package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.RequisitoDeAsignatura;

import java.util.List;

@Dao
public interface RequisitoDeAsignaturaRoomDAO {

    @Query("SELECT * FROM requisitos_de_asignatura")
    List<RequisitoDeAsignatura> getAll();

    @Query("SELECT * FROM requisitos_de_asignatura WHERE id = :id")
    List<RequisitoDeAsignatura> getById(String id);

    @Insert
    void insertMany(RequisitoDeAsignatura ... requisitosDeAsignatura);
    @Insert
    void insertOne(RequisitoDeAsignatura requisitoDeAsignatura);

    @Update
    void updateAll(RequisitoDeAsignatura ... requisitosDeAsignatura);
    @Update
    void updateList(List<RequisitoDeAsignatura> requisitosDeAsignatura);
    @Update
    void updateOne(RequisitoDeAsignatura requisitoDeAsignatura);

    @Delete
    void deleteMany(RequisitoDeAsignatura ... requisitosDeAsignatura);
    @Query("DELETE FROM requisitos_de_asignatura WHERE id = :id")
    void deleteById(String id);
}
