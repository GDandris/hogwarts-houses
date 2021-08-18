package com.codecool.hogwartshouses.model.DTO;

import com.codecool.hogwartshouses.model.entity.types.Ingredient;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class RecipeDTO {

    //TODO MARCI
    private Long id;
    private String name;
    private List<Ingredient> ingredients;

}
