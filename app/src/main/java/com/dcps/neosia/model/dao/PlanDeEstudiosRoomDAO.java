package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.PlanDeEstudios;

import java.util.List;

@Dao
public interface PlanDeEstudiosRoomDAO {

    @Query("SELECT * FROM planes_de_estudios")
    List<PlanDeEstudios> getAll();

    @Query("SELECT * FROM planes_de_estudios WHERE id = :id")
    List<PlanDeEstudios> getById(String id);

    @Insert
    void insertMany(PlanDeEstudios... planesDeEstudios);
    @Insert
    void insertOne(PlanDeEstudios planDeEstudios);

    @Update
    void updateAll(PlanDeEstudios ... planesDeEstudios);
    @Update
    void updateList(List<PlanDeEstudios> planesDeEstudios);
    @Update
    void updateOne(PlanDeEstudios planDeEstudios);

    @Delete
    void deleteMany(PlanDeEstudios ... planesDeEstudios);
    @Query("DELETE FROM planes_de_estudios WHERE id = :id")
    void deleteById(String id);
}
