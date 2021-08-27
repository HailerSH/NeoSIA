package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.ProgramaAcademico;

import java.util.List;

@Dao
public interface ProgramaAcademicoRoomDAO {

    @Query("SELECT * FROM programas_academicos")
    List<ProgramaAcademico> getAll();

    @Query("SELECT * FROM programas_academicos WHERE id = :id")
    List<ProgramaAcademico> getById(String id);

    @Insert
    void insertMany(ProgramaAcademico ... programasAcademicos);
    @Insert
    void insertOne(ProgramaAcademico programasAcademicos);

    @Update
    void updateAll(ProgramaAcademico ... programasAcademicos);
    @Update
    void updateList(List<ProgramaAcademico> programasAcademicos);
    @Update
    void updateOne(ProgramaAcademico programaAcademico);

    @Delete
    void deleteMany(ProgramaAcademico ... programasAcademicos);
    @Query("DELETE FROM programas_academicos WHERE id = :id")
    void deleteById(String id);
}
