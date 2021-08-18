package com.codecool.hogwartshouses.dao.implementations.jpa;

import com.codecool.hogwartshouses.dao.RoomDao;
import com.codecool.hogwartshouses.dao.implementations.repository.RoomDaoRepository;
import com.codecool.hogwartshouses.model.entity.RoomEntity;
import com.codecool.hogwartshouses.model.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public class RoomDaoJpa implements RoomDao {
    @Autowired
    private RoomDaoRepository roomDaoRepository;

    @Override
    public void addRoom(RoomEntity roomEntity) {
        roomDaoRepository.save(roomEntity);
    }

    @Override
    public List<RoomEntity> listRooms() {
        List<RoomEntity> rooms = new ArrayList<>();
        roomDaoRepository.findAll().forEach(rooms::add);
        return rooms;
    }

    @Override
    public RoomEntity findRoomById(long id) {
        Optional<RoomEntity> roomOptional = roomDaoRepository.findById(id);
        if (roomOptional.isEmpty()) {
            throw new RuntimeException("Room not found!");
        }
        return roomOptional.get();
    }

    @Override
    public void deleteRoomById(long id) {
        roomDaoRepository.deleteById(id);
    }

    @Override
    public void updateRoomById(long id, RoomEntity newRoomEntity) {

        newRoomEntity.setId(id);
        roomDaoRepository.save(newRoomEntity);
    }

    @Override
    public Set<StudentEntity> getStudentsByRoomId(long id) {
        RoomEntity roomEntity = findRoomById(id);
        Set students = roomEntity.getStudentEntities();
        return students;
    }

    @Override
    public List<RoomEntity> findAvailableRooms() {
        return null;
    }

    @Override
    public List<RoomEntity> findRoomWithNoCatOrOwl() {
        return null;
    }
}
