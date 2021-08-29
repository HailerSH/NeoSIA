package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.Citacion;

import java.util.List;

@Dao
public interface CitacionRoomDAO {

    @Query("SELECT * FROM citaciones")
    List<Citacion> getAll();

    @Query("SELECT * FROM citaciones WHERE id = :id")
    List<Citacion> getById(String id);

    @Insert
    void insertMany(Citacion ... citaciones);
    @Insert
    void insertOne(Citacion citacion);

    @Update
    void updateAll(Citacion ... citaciones);
    @Update
    void updateList(List<Citacion> citaciones);
    @Update
    void updateOne(Citacion citacion);

    @Delete
    void deleteMany(Citacion... citaciones);
    @Query("DELETE FROM citaciones WHERE id = :id")
    void deleteById(String id);
}
