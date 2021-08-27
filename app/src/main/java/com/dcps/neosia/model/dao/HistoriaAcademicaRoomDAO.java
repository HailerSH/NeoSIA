package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.HistoriaAcademica;

import java.util.List;

@Dao
public interface HistoriaAcademicaRoomDAO {

    @Query("SELECT * FROM historias_academicas")
    List<HistoriaAcademica> getAll();

    @Query("SELECT * FROM historias_academicas WHERE id = :id")
    List<HistoriaAcademica> getById(String id);

    @Query("SELECT * FROM historias_academicas WHERE estudiante_id = (SELECT id FROM estudiantes WHERE identidad = :identidad)")
    List<HistoriaAcademica> getByEstudianteIdentidad(String identidad);

    @Insert
    void insertMany(HistoriaAcademica ... historiasAcademicas);
    @Insert
    void insertOne(HistoriaAcademica historiaAcademica);

    @Update
    void updateAll(HistoriaAcademica ... historiasAcademicas);
    @Update
    void updateList(List<HistoriaAcademica> historiasAcademicas);
    @Update
    void updateOne(HistoriaAcademica historiaAcademica);

    @Delete
    void deleteMany(HistoriaAcademica ... historiasAcademicas);
    @Query("DELETE FROM historias_academicas WHERE id = :id")
    void deleteById(String id);
}
