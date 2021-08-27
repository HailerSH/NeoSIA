package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.Grupo;

import java.util.List;

@Dao
public interface GrupoRoomDAO {

    @Query("SELECT * FROM grupos")
    List<Grupo> getAll();

    @Query("SELECT * FROM grupos WHERE id = :id")
    List<Grupo> getById(String id);

    @Insert
    void insertMany(Grupo ... grupos);
    @Insert
    void insertOne(Grupo grupo);

    @Update
    void updateAll(Grupo ... grupos);
    @Update
    void updateList(List<Grupo> grupos);
    @Update
    void updateOne(Grupo grupo);

    @Delete
    void deleteMany(Grupo ... grupos);
    @Query("DELETE FROM grupos WHERE id = :id")
    void deleteById(String id);
}
