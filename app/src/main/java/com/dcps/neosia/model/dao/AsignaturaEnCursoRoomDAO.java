package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.AsignaturaEnCurso;

import java.util.List;

@Dao
public interface AsignaturaEnCursoRoomDAO {

    @Query("SELECT * FROM asignaturas_en_curso")
    List<AsignaturaEnCurso> getAll();

    @Query("SELECT * FROM asignaturas_en_curso WHERE id = :id")
    List<AsignaturaEnCurso> getById(String id);

    @Insert
    void insertMany(AsignaturaEnCurso ... asignaturasEnCurso);
    @Insert
    void insertOne(AsignaturaEnCurso asignaturaEnCurso);

    @Update
    void updateAll(AsignaturaEnCurso... asignaturasEnCurso);
    @Update
    void updateList(List<AsignaturaEnCurso> asignaturasEnCurso);
    @Update
    void updateOne(AsignaturaEnCurso asignaturaEnCurso);

    @Delete
    void deleteMany(AsignaturaEnCurso ... asignaturasEnCurso);
    @Query("DELETE FROM asignaturas_en_curso WHERE id = :id")
    void deleteById(String id);
}
