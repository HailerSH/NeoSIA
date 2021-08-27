package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.Docente;
import com.dcps.neosia.model.pojo.Estudiante;

import java.util.List;

@Dao
public interface DocenteRoomDAO {

    @Query("SELECT * FROM docentes")
    List<Docente> getAll();

    @Query("SELECT * FROM docentes WHERE id = :id")
    List<Docente> getById(String id);

    @Query("SELECT * FROM docentes WHERE username = :username")
    List<Docente> getByUsername(String username);

    @Query("SELECT * FROM docentes WHERE identidad = :identidad")
    List<Docente> getByIdentidad(String identidad);

    @Insert
    void insertMany(Docente ... docentes);
    @Insert
    void insertOne(Docente docente);

    @Update
    void updateAll(Docente ... docentes);
    @Update
    void updateList(List<Docente> docentes);
    @Update
    void updateOne(Docente docente);

    @Delete
    void deleteMany(Docente ... docentes);
    @Query("DELETE FROM docentes WHERE id = :id")
    void deleteById(String id);
}
