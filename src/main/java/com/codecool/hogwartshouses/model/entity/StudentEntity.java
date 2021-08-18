package com.codecool.hogwartshouses.model.entity;

import com.codecool.hogwartshouses.model.entity.types.HouseType;
import com.codecool.hogwartshouses.model.entity.types.PetType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
@EqualsAndHashCode
public class StudentEntity {
    //TODO Lilla
    /*
    student létrejöhet room nélkül,
    room létrejöhet student nélkül

    törlést átgondolni (függetlenül lehet törölni, student-et, vagy room-ot)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private HouseType houseType;
    @Enumerated(EnumType.STRING)
    private PetType petType;
    @ManyToOne
    @JsonIgnore
    private RoomEntity roomEntity;
    private boolean hasPureBlood;
    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "student_recipe",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "recipe_id"))
    private List<RecipeEntity> recipeEntities;
}