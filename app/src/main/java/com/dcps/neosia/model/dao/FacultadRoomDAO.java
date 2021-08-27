package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.Facultad;

import java.util.List;

@Dao
public interface FacultadRoomDAO {

    @Query("SELECT * FROM facultades")
    List<Facultad> getAll();

    @Query("SELECT * FROM facultades WHERE id = :id")
    List<Facultad> getById(String id);

    @Insert
    void insertMany(Facultad... facultades);
    @Insert
    void insertOne(Facultad facultad);

    @Update
    void updateAll(Facultad ... facultades);
    @Update
    void updateList(List<Facultad> facultades);
    @Update
    void updateOne(Facultad facultad);

    @Delete
    void deleteMany(Facultad ... facultades);
    @Query("DELETE FROM facultades WHERE id = :id")
    void deleteById(String id);
}
