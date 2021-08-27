package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.Estudiante;
import com.dcps.neosia.model.pojo.User;

import java.util.List;

@Dao
public interface EstudianteRoomDAO {

    @Query("SELECT * FROM estudiantes")
    List<Estudiante> getAll();

    @Query("SELECT * FROM estudiantes WHERE id = :id")
    List<Estudiante> getById(String id);

    @Query("SELECT * FROM estudiantes WHERE username = :username")
    List<Estudiante> getByUsername(String username);

    @Insert
    void insertMany(Estudiante ... estudiantes);
    @Insert
    void insertOne(Estudiante estudiante);

    @Update
    void updateAll(Estudiante ... estudiantes);
    @Update
    void updateList(List<Estudiante> estudiantes);
    @Update
    void updateOne(Estudiante estudiante);

    @Delete
    void deleteMany(Estudiante ... estudiantes);
    @Query("DELETE FROM estudiantes WHERE id = :id")
    void deleteById(String id);
}
