package com.codecool.hogwartshouses.dao.implementations.repository;

import com.codecool.hogwartshouses.model.entity.BuildingEntity;
import org.springframework.data.repository.CrudRepository;

public interface BuildingDaoRepository extends CrudRepository<BuildingEntity, Long> {
}
