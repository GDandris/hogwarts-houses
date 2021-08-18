package com.codecool.hogwartshouses.dao.implementations.repository;

import com.codecool.hogwartshouses.model.entity.SpellEntity;
import org.springframework.data.repository.CrudRepository;

public interface SpellDaoRepository extends CrudRepository<SpellEntity, Long> {
}
