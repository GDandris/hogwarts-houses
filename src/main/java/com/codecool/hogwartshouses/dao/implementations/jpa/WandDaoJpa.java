package com.codecool.hogwartshouses.dao.implementations.jpa;

import com.codecool.hogwartshouses.dao.WandDao;
import com.codecool.hogwartshouses.dao.implementations.repository.WandDaoRepository;
import com.codecool.hogwartshouses.model.entity.WandEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class WandDaoJpa implements WandDao {

    @Autowired
    WandDaoRepository wandDaoRepository;


    @Override
    public WandEntity save(WandEntity wandEntity) {
        return wandDaoRepository.save(wandEntity);
    }

    public WandEntity findById(Long aLong) {
        if(wandDaoRepository.findById(aLong).isPresent()) {
            return wandDaoRepository.findById(aLong).get();
        }else {
            throw new RuntimeException("Spell not found!");
        }
    }

    public List<WandEntity> findAll() {
        List<WandEntity> wandEntities = new ArrayList<>();
        wandDaoRepository.findAll().forEach(wandEntities::add);
        return wandEntities;
    }

    public void deleteById(Long aLong) {
        wandDaoRepository.deleteById(aLong);
    }
}
