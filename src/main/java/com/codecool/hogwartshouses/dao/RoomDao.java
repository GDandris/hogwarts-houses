package com.codecool.hogwartshouses.dao;


import com.codecool.hogwartshouses.model.entity.RoomEntity;
import com.codecool.hogwartshouses.model.entity.StudentEntity;
import java.util.List;
import java.util.Set;

public interface RoomDao {

    List<RoomEntity> listRooms();
    void addRoom(RoomEntity roomEntity);
    RoomEntity findRoomById(long id);
    void deleteRoomById(long id);
    void updateRoomById(long id, RoomEntity newRoomEntity);
    Set<StudentEntity> getStudentsByRoomId(long id);
    List<RoomEntity> findAvailableRooms();
    List<RoomEntity> findRoomWithNoCatOrOwl();

}