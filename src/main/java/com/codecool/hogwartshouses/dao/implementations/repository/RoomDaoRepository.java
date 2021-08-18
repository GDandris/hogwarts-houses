package com.codecool.hogwartshouses.dao.implementations.repository;

import com.codecool.hogwartshouses.model.entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoomDaoRepository extends CrudRepository<RoomEntity, Long> {
}
