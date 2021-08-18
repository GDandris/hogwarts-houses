package com.codecool.hogwartshouses.model;

import com.codecool.hogwartshouses.model.entity.types.Ingredient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
public class Recipe {
    @JsonIgnore
    private long id;
    private String name;
    @JsonIgnore
    private List<Ingredient> ingredients;
}