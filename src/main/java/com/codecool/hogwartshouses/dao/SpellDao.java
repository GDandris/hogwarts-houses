package com.codecool.hogwartshouses.dao;

import com.codecool.hogwartshouses.model.entity.SpellEntity;

import java.util.List;

public interface SpellDao {
    SpellEntity save(SpellEntity spellEntity);
    SpellEntity findById(Long id);
    List<SpellEntity> findAll();
    void deleteById(Long id);
}