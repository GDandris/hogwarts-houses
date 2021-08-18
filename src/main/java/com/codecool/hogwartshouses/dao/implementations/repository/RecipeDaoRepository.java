package com.codecool.hogwartshouses.dao.implementations.repository;

import com.codecool.hogwartshouses.model.entity.RecipeEntity;
import org.springframework.data.repository.CrudRepository;

public interface RecipeDaoRepository extends CrudRepository<RecipeEntity, Long> {
}
