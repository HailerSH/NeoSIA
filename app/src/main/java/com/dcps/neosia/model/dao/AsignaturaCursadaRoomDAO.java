package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.AsignaturaCursada;
import com.dcps.neosia.model.pojo.PeriodoDeTiempo;

import java.util.List;

@Dao
public interface AsignaturaCursadaRoomDAO {

    @Query("SELECT * FROM asignaturas_cursadas")
    List<AsignaturaCursada> getAll();

    @Query("SELECT * FROM asignaturas_cursadas WHERE id = :id")
    List<AsignaturaCursada> getById(String id);

    @Insert
    void insertMany(AsignaturaCursada ... asignaturasCursadas);
    @Insert
    void insertOne(AsignaturaCursada asignaturaCursada);

    @Update
    void updateAll(AsignaturaCursada ... asignaturasCursadas);
    @Update
    void updateList(List<AsignaturaCursada> asignaturasCursadas);
    @Update
    void updateOne(AsignaturaCursada asignaturaCursada);

    @Delete
    void deleteMany(AsignaturaCursada... asignaturasCursadas);
    @Query("DELETE FROM asignaturas_cursadas WHERE id = :id")
    void deleteById(String id);
}
