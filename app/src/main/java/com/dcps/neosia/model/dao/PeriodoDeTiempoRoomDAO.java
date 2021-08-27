package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.PeriodoDeTiempo;

import java.util.List;

@Dao
public interface PeriodoDeTiempoRoomDAO {

    @Query("SELECT * FROM periodos_de_tiempo")
    List<PeriodoDeTiempo> getAll();

    @Query("SELECT * FROM periodos_de_tiempo WHERE id = :id")
    List<PeriodoDeTiempo> getById(String id);

    @Insert
    void insertMany(PeriodoDeTiempo ... periodosDeTiempo);
    @Insert
    void insertOne(PeriodoDeTiempo periodoDeTiempo);

    @Update
    void updateAll(PeriodoDeTiempo ... periodosDeTiempo);
    @Update
    void updateList(List<PeriodoDeTiempo> periodosDeTiempo);
    @Update
    void updateOne(PeriodoDeTiempo periodoDeTiempo);

    @Delete
    void deleteMany(PeriodoDeTiempo ... periodosDeTiempo);
    @Query("DELETE FROM periodos_de_tiempo WHERE id = :id")
    void deleteById(String id);
}
