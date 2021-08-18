package com.codecool.hogwartshouses.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Wand {
    @JsonIgnore
    private Long id;
    private String woodType;
    private String color;
    private Teacher teacher;
    private List<Spell> spells;
}
