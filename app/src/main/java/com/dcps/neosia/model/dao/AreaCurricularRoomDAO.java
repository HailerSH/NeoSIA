package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.AreaCurricular;

import java.util.List;

@Dao
public interface AreaCurricularRoomDAO {

    @Query("SELECT * FROM areas_curriculares")
    List<AreaCurricular> getAll();

    @Query("SELECT * FROM areas_curriculares WHERE id = :id")
    List<AreaCurricular> getById(String id);

    @Query("SELECT * FROM areas_curriculares WHERE nombre = :nombre")
    List<AreaCurricular> getByNombre(String nombre);

    @Insert
    void insertMany(AreaCurricular ... areasCurriculares);
    @Insert
    void insertOne(AreaCurricular areaCurricular);

    @Update
    void updateAll(AreaCurricular ... areasCurriculares);
    @Update
    void updateList(List<AreaCurricular> areasCurriculares);
    @Update
    void updateOne(AreaCurricular areaCurricular);

    @Delete
    void deleteMany(AreaCurricular... areasCurriculares);
    @Query("DELETE FROM areas_curriculares WHERE id = :id")
    void deleteById(String id);
}
