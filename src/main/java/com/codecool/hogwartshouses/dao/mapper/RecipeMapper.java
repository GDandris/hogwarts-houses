package com.codecool.hogwartshouses.dao.mapper;

import com.codecool.hogwartshouses.model.entity.RecipeEntity;
import com.codecool.hogwartshouses.model.entity.types.Ingredient;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.stream.Collectors;

@Component
public class RecipeMapper implements RowMapper<RecipeEntity> {
    @Override
    public RecipeEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        return RecipeEntity.builder()
                .id(resultSet.getLong("id"))
                .name(resultSet.getString("name"))
                /*.ingredients(Arrays.stream(resultSet.getString("ingredient").split(","))
                        .map(string -> Ingredient.valueOf(string))
                        .collect(Collectors.toList()))*/
                .build();
    }
}