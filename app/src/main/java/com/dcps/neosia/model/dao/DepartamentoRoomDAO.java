package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.Departamento;

import java.util.List;

@Dao
public interface DepartamentoRoomDAO {

    @Query("SELECT * FROM departamentos")
    List<Departamento> getAll();

    @Query("SELECT * FROM departamentos WHERE id = :id")
    List<Departamento> getById(String id);

    @Insert
    void insertMany(Departamento ... departamentos);
    @Insert
    void insertOne(Departamento departamento);

    @Update
    void updateAll(Departamento ... departamentos);
    @Update
    void updateList(List<Departamento> departamentos);
    @Update
    void updateOne(Departamento departamento);

    @Delete
    void deleteMany(Departamento ... departamentos);
    @Query("DELETE FROM departamentos WHERE id = :id")
    void deleteById(String id);
}
