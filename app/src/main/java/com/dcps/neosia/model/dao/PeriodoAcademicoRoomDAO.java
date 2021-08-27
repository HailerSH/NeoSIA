package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.PeriodoAcademico;

import java.util.List;

@Dao
public interface PeriodoAcademicoRoomDAO {

    @Query("SELECT * FROM periodos_academicos")
    List<PeriodoAcademico> getAll();

    @Query("SELECT * FROM periodos_academicos WHERE id = :id")
    List<PeriodoAcademico> getById(String id);

    @Query("SELECT * FROM periodos_academicos WHERE codigo = :codigo")
    List<PeriodoAcademico> getByCodigo(String codigo);

    @Insert
    void insertMany(PeriodoAcademico ... periodosAcademicos);
    @Insert
    void insertOne(PeriodoAcademico periodoAcademico);

    @Update
    void updateAll(PeriodoAcademico ... periodosAcademicos);
    @Update
    void updateList(List<PeriodoAcademico> periodosAcademicos);
    @Update
    void updateOne(PeriodoAcademico periodoAcademico);

    @Delete
    void deleteMany(PeriodoAcademico ... periodosAcademicos);
    @Query("DELETE FROM periodos_academicos WHERE id = :id")
    void deleteById(String id);
}
