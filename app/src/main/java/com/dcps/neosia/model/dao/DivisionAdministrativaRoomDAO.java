package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.DivisionAdministrativa;

import java.util.List;

@Dao
public interface DivisionAdministrativaRoomDAO {

    @Query("SELECT * FROM divisiones_administrativas")
    List<DivisionAdministrativa> getAll();

    @Query("SELECT * FROM divisiones_administrativas WHERE id = :id")
    List<DivisionAdministrativa> getById(String id);

    @Insert
    void insertMany(DivisionAdministrativa ... divisionesAdministrativas);
    @Insert
    void insertOne(DivisionAdministrativa divisionAdministrativa);

    @Update
    void updateAll(DivisionAdministrativa ... divisionesAdministrativas);
    @Update
    void updateList(List<DivisionAdministrativa> divisionesAdministrativas);
    @Update
    void updateOne(DivisionAdministrativa divisionAdministrativa);

    @Delete
    void deleteMany(DivisionAdministrativa ... divisionesAdministrativas);
    @Query("DELETE FROM divisiones_administrativas WHERE id = :id")
    void deleteById(String id);
}
