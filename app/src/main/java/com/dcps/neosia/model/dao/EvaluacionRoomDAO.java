package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.Evaluacion;

import java.util.List;

@Dao
public interface EvaluacionRoomDAO {

    @Query("SELECT * FROM evaluaciones")
    List<Evaluacion> getAll();

    @Query("SELECT * FROM evaluaciones WHERE id = :id")
    List<Evaluacion> getById(String id);

    @Insert
    void insertMany(Evaluacion ... evaluaciones);
    @Insert
    void insertOne(Evaluacion evaluacion);

    @Update
    void updateAll(Evaluacion ... evaluaciones);
    @Update
    void updateList(List<Evaluacion> evaluaciones);
    @Update
    void updateOne(Evaluacion evaluacion);

    @Delete
    void deleteMany(Evaluacion ... evaluaciones);
    @Query("DELETE FROM evaluaciones WHERE id = :id")
    void deleteById(String id);
}
