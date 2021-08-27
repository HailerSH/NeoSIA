package com.dcps.neosia.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dcps.neosia.model.pojo.User;

import java.util.List;

@Dao
public interface UserRoomDAO {

    @Query("SELECT * FROM users")
    List<User> getAll();

    @Query("SELECT * FROM users WHERE username = :username")
    List<User> getByUsername(String username);

    @Insert
    void insertMany(User ... users);
    @Insert
    void insertOne(User user);

    @Update
    void updateAll(User ... users);
    @Update
    void updateList(List<User> users);
    @Update
    void updateOne(User user);

    @Delete
    void deleteMany(User ... users);
    @Query("DELETE FROM users WHERE id = :id")
    void deleteById(String id);
}
