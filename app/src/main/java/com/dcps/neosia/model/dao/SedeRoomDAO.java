package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.Sede;

import java.util.List;

@Dao
public interface SedeRoomDAO {

    @Query("SELECT * FROM sedes")
    List<Sede> getAll();

    @Query("SELECT * FROM sedes WHERE id = :id")
    List<Sede> getById(String id);

    @Insert
    void insertMany(Sede ... sedes);
    @Insert
    void insertOne(Sede sede);

    @Update
    void updateAll(Sede ... sedes);
    @Update
    void updateList(List<Sede> sedes);
    @Update
    void updateOne(Sede sede);

    @Delete
    void deleteMany(Sede ... sedes);
    @Query("DELETE FROM sedes WHERE id = :id")
    void deleteById(String id);
}
